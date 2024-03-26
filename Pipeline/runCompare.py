import os, csv

i = 0
csvfile = open('allPackage.csv', newline='')
reader = csv.DictReader(csvfile)
for row in reader:
  
  os.system(f"python compare.py {row['PackageName']}")
  i += 1
