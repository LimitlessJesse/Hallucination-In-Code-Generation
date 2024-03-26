import os.path,subprocess,sys,csv
from subprocess import STDOUT,PIPE
from threading import Timer

def compile_and_run(packagePath, fileName, stdin, csvWriter, outputFile):

  java_file = f'./{packagePath}/javaFiles/{fileName}.java'
  result = 0
  try:
    subprocess.check_output(['javac', java_file], stderr=subprocess.STDOUT)
  except subprocess.CalledProcessError as e:
    result = -1
    
    csvWriter.writerow([fileName, 'False', 'False', 'False'])
    outputFile.write(f'Sample: {fileName}\n')
    outputFile.write('----------------------------------------------------------------\n')
    outputFile.write(f'output:\n{e.output.decode("utf-8")}\n\n')
    outputFile.write('================================================================\n\n')


  
  if result != -1:
    java_class,ext = os.path.splitext(java_file)
    cmd = ['java', java_file]
    proc = subprocess.Popen(cmd, stdin=PIPE, stdout=PIPE, stderr=PIPE)

    timer = Timer(10, proc.kill)
    try:
      timer.start()
      stdout,stderr = proc.communicate(stdin)

      stdout = stdout.decode("utf-8")
      stderr = stderr.decode("utf-8")

      if timer.is_alive():
        # Error exist
        if stderr != '':
          csvWriter.writerow([fileName, 'True', 'False', 'False'])
        else:
          csvWriter.writerow([fileName, 'True', 'True', 'True'])

        outputFile.write(f'Sample: {fileName}\n')
        outputFile.write('----------------------------------------------------------------\n')
        if stdout != '':
          outputFile.write(f'stdout:\n{stdout}\n')
        if stderr != '':
          outputFile.write(f'stderr:\n{stderr}\n')
        outputFile.write('================================================================\n\n')
      else:
        print("timeout")
        csvWriter.writerow([fileName, 'True', 'False', 'False'])
        outputFile.write(f'Sample: {fileName}\n')
        outputFile.write('----------------------------------------------------------------\n')
        outputFile.write('timeout: process took too long\n')
        outputFile.write('================================================================\n\n')
    finally:
      timer.cancel()


if sys.argv[1] == None:
  print("Package name not provided as command line argument")
  exit(1)

packageName = sys.argv[1]
packagePath = packageName.replace(".","_")

CSVFile = open(f'./{packagePath}/{packagePath}SnippetRecord.csv', newline='')
recordReader = csv.DictReader(CSVFile)

# For writing the final result to see if code can run
csvFinalResult = open(f'./{packagePath}/{packagePath}Result.csv', 'w', newline='')
csvWriter = csv.writer(csvFinalResult)
field = ["FileName", "Compilable", "Runnable", "Correct"]
csvWriter.writerow(field)

# For writing the output to a file
outputFile = open(f'./{packagePath}/{packagePath}OutputResult.txt', 'w')
print("==========================================================================================")
print(f"running {packageName}")
i = 0
for row in recordReader:
  if row['UsedPackage'] == 'True':
    # put stdin in case some program needs one
    # print(f'Running {row["FileName"]}')
    print(f"{i}", end=" ")
    compile_and_run(packagePath, row['FileName'], b'in case', csvWriter, outputFile)
    i += 1

print("==========================================================================================")
