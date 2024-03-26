import requests
from bs4 import BeautifulSoup
import re
import os
import csv

def crawl_java_docs(packageName, api_url):
    urlName = packageName.replace(".","/")
    name = packageName.replace(".","_")

    if not os.path.exists(name):
        os.makedirs(name)

    # Send a GET request to the API documentation URL
    response = requests.get(api_url)
    
    if response.status_code == 200:
        file = open(f'./{name}/{name}Classes.csv', 'w', newline='')
        writer = csv.writer(file)
        field = ["ClassName", "URL"]
        writer.writerow(field)

        # Parse the HTML content
        soup = BeautifulSoup(response.text, 'html.parser')
        
        tables = soup.find_all('table', class_='typeSummary')

        for table in tables:
            if table.has_attr('summary') and table['summary'] == 'Class Summary table, listing classes, and an explanation':
                for tr in table.find_all('tr'):
                    # print(tr)
                    class_link = tr.find_all('a', href=True)
                    class_description = tr.find_all('div')
                    # print(class_link)
                    if len(class_link) != 0:
                        class_name = class_link[0].text.strip()
                        writer.writerow([class_name, f"https://docs.oracle.com/javase/8/docs/api/{urlName}/{class_name}.html"])

                    



        # for tr in soup.find('table', class_='data').find_all('tr'):
        
    else:
        print("Failed to retrieve Java API documentation.")

if __name__ == "__main__":
    csvfile = open('allPackage.csv', newline='')
    reader = csv.DictReader(csvfile)
    for row in reader:
        crawl_java_docs(row['PackageName'], row['URL'])
        print(f"Finish{row['PackageName']}")