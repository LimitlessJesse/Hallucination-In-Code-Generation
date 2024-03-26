from transformers import pipeline
import torch
import json
import pandas as pd
import csv
import re
import os
import sys

MAGICODER_PROMPT = """
@@ Instruction
I want to learn how to use {method} from {package}.{className}
Generate a complete code snippet of this method. The code snippet needs to be executable with import statement and put the method and code snippet in the format below:

Code snippet:
public class Main {{
    public static void main(String[] args) {{
        
    }}
}}

For example:
`boolean add(E e)`: This method appends the specified element to the end of this list.

Code snippet:
```java
import java.util.ArrayList;

public class Main {{
    public static void main(String[] args) {{
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }}
}}

@@ Response
"""

if sys.argv[1] == None:
  print("Package name not provided as command line argument")
  exit(1)

packageName = sys.argv[1]
packagePath = packageName.replace(".","_")

if not os.path.exists(f"./{packagePath}/javaFiles"):
  os.makedirs(f"./{packagePath}/javaFiles")

print(f'Generating Code Snippet for {packageName}')

print("Loading model")
generator = pipeline(
  model="ise-uiuc/Magicoder-S-DS-6.7B",
  task="text-generation",
  torch_dtype=torch.bfloat16,
  device_map="auto",
)

snippet_number = 5
outputFile = open(f'./{packagePath}/{packagePath}_snippet.txt', 'w')

prompts = []

csvfile = open(f'./{packagePath}/{packagePath}MethodCheck.csv', newline='')
reader = csv.DictReader(csvfile)
classNameList = []
fileNameList = []
i = 0
for row in reader:
  if row['Exist'] == 'True':
    classNameList.append(row['ClassName'])
    fileNameList.append(f'{row["ClassName"]}_{row["Snippet Number"]}')
    prompts.append(MAGICODER_PROMPT.format(method=row['Method'], package=packageName, className=row['ClassName']))
    i += 1
  

print("Loading generator")
sequences = generator(
  prompts,
  do_sample=False,
  num_return_sequences=1,
  max_length=1200,
  truncation=True,
)

# CSV File for method checking
outputCSVFile = open(f'./{packagePath}/{packagePath}SnippetRecord.csv', 'w', newline='')
writer = csv.writer(outputCSVFile)
field = ["FileName", "UsedPackage"]
writer.writerow(field)

i = 0
for seq in sequences:
  pattern = r'@ Response.*\`\`\`java\n(.*?)\`\`\`'
  matches = re.findall(pattern, seq[0]["generated_text"], re.DOTALL)
  
  if matches:
    for match in matches:
      if classNameList[i] in match:
        fileNameList[i] = fileNameList[i].replace('.', '_')
        writer.writerow([fileNameList[i], "True"])

        # create java file
        match = match.replace("Main", fileNameList[i], 1)
        javaFile = open(f'./{packagePath}/javaFiles/{fileNameList[i]}.java', 'w')
        javaFile.write(match)

      else:
        writer.writerow([fileNameList[i], "False"])
  else:
    writer.writerow([fileNameList[i], "False"])

  outputFile.write(f'Sample: {i} {classNameList[i]}\n')
  outputFile.write('----------------------------------------------------------------\n')
  outputFile.write(f'{seq[0]["generated_text"]}\n')
  outputFile.write('================================================================\n\n')
  i += 1
