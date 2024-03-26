import csv, sys

def divide(a, b):
  return a / b if b else 0

def calculate(packageName, writer):
  packagePath = packageName.replace(".","_")

  if packageName == None or packageName == "":
    print("No Package name inputted")
  else:

    basePath = f'./{packagePath}/{packagePath}'
    
    # Method Recommended Stat
    totalRecommendedMethod = 0
    existRecommendedMethod = 0

    methodCheckCSV = open(basePath+'MethodCheck.csv', newline='')
    methodCheckCSVReader = csv.DictReader(methodCheckCSV)

    for row in methodCheckCSVReader:
      if row['Exist'] == 'True':
        existRecommendedMethod += 1
      totalRecommendedMethod += 1


    # Snippet Generated Stat
    totalSnippetGenerated = 0
    snippetUsedPackageCount = 0

    snippetCSV = open(basePath+'SnippetRecord.csv', newline='')
    snippetCSVReader = csv.DictReader(snippetCSV)

    for row in snippetCSVReader:
      if row['UsedPackage'] == 'True':
        snippetUsedPackageCount += 1
      totalSnippetGenerated += 1

    # Final Result Stat
    totalFileCreated = 0
    compilableCount = 0
    runnableCount = 0

    resultCSV = open(basePath+'Result.csv', newline='')
    resultCSVReader = csv.DictReader(resultCSV)

    for row in resultCSVReader:
      if row['Compilable'] == 'True':
        compilableCount += 1
      if row['Runnable'] == 'True':
        runnableCount += 1
      totalFileCreated += 1

    existPercentage = round(divide(existRecommendedMethod,totalRecommendedMethod) * 100, 2)
    statOutputFile = open(basePath+'stats.txt', 'w')
    statOutputFile.write(f"Total recommended method: {str(totalRecommendedMethod)}\n")
    statOutputFile.write(f"Recommended method exist: {str(existRecommendedMethod)}\n\n")
    statOutputFile.write(f'Exist percentage: {existRecommendedMethod}/{totalRecommendedMethod} = {str(existPercentage)}\n')
    statOutputFile.write('==============================================================================\n\n')

    usedPackagePercentage_1 = round(divide(snippetUsedPackageCount,totalSnippetGenerated) * 100, 2)
    usedPackagePercentage_2 = round(divide(snippetUsedPackageCount,totalRecommendedMethod) * 100, 2)
    statOutputFile.write(f"Total code snippet generated: {str(totalSnippetGenerated)}\n")
    statOutputFile.write(f"Package exist in code snippet: {str(snippetUsedPackageCount)}\n\n")
    statOutputFile.write(f'Used Package percentage: {snippetUsedPackageCount}/{totalSnippetGenerated} = {str(usedPackagePercentage_1)}\n')
    statOutputFile.write(f'                       : {snippetUsedPackageCount}/{totalRecommendedMethod} = {str(usedPackagePercentage_2)} (against total recommended)\n')
    statOutputFile.write('==============================================================================\n\n')

    statOutputFile.write(f"Total java file created: {str(totalFileCreated)}\n")
    statOutputFile.write(f"Compilable: {str(compilableCount)}\n")
    statOutputFile.write(f"Runnable: {str(runnableCount)}\n\n")

    compiablePercentage_1 = round(divide(compilableCount,totalFileCreated) * 100, 2)
    compiablePercentage_2 = round(divide(compilableCount,totalSnippetGenerated) * 100, 2)
    compiablePercentage_3 = round(divide(compilableCount,totalRecommendedMethod) * 100, 2)
    statOutputFile.write(f'Compilable Percentage: {compilableCount}/{totalFileCreated} = {str(compiablePercentage_1)} (against total file created)\n' )
    statOutputFile.write(f'                     : {compilableCount}/{totalSnippetGenerated} = {str(compiablePercentage_2)} (against snippet generated)\n')
    statOutputFile.write(f'                     : {compilableCount}/{totalRecommendedMethod} = {str(compiablePercentage_3)} (against total recommended)\n\n')

    runnablePercentage_1 = round(divide(runnableCount,totalSnippetGenerated) * 100, 2)
    runnablePercentage_2 = round(divide(runnableCount,totalFileCreated) * 100, 2)
    runnablePercentage_3 = round(divide(runnableCount,totalSnippetGenerated) * 100, 2)
    runnablePercentage_4 = round(divide(runnableCount,totalRecommendedMethod) * 100, 2)
    statOutputFile.write(f'Runnable Percentage: {runnableCount}/{compilableCount} = {str(runnablePercentage_1)} (against compilable)\n')
    statOutputFile.write(f'                   : {runnableCount}/{totalFileCreated} = {str(runnablePercentage_2)} (against total file created)\n')
    statOutputFile.write(f'                   : {runnableCount}/{totalSnippetGenerated} = {str(runnablePercentage_3)} (against snippet generated)\n')
    statOutputFile.write(f'                   : {runnableCount}/{totalRecommendedMethod} = {str(runnablePercentage_4)} (against total recommended)\n')

    writer.writerow([packageName, totalRecommendedMethod, existRecommendedMethod, snippetUsedPackageCount, compilableCount, runnableCount, "", existPercentage, "", usedPackagePercentage_1, usedPackagePercentage_2, "", compiablePercentage_1, compiablePercentage_2, compiablePercentage_3, "", runnablePercentage_1, runnablePercentage_2, runnablePercentage_3, runnablePercentage_4])

i = 0
csvfile = open('allPackage.csv', newline='')
reader = csv.DictReader(csvfile)

file = open(f'./finalStats.csv', 'w', newline='')
writer = csv.writer(file)
field = ["PackageName", "Recommended", "Exist", "Used Package", "Compliable", "Runnable", "Percentage=>", "Exist/Recommended", "1", "Used Package/Exist", "Used Package/Recommended", "2", "Compilable/Used Package", "Compilable/Exist", "Compilable/Recommended", "3", "Runnable/Compilable", "Runnable/Used Package", "Runnable/Exist", "Runnable/Recommended"]
writer.writerow(field)

for row in reader:
  
  calculate(row['PackageName'], writer)
  i += 1