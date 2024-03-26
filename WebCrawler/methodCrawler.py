import requests
from bs4 import BeautifulSoup
import re
import csv

def crawl_java_util_docs(className, url, writer):

    # Send a GET request to the API documentation URL
    response = requests.get(url)
    
    if response.status_code == 200:

        # Parse the HTML content
        soup = BeautifulSoup(response.text, 'html.parser')

        tables = soup.find_all('table', class_='memberSummary')

        for table in tables:
            if table.has_attr('summary') and table['summary'] == 'Method Summary table, listing methods, and an explanation':
                for tr in table.find_all('tr'):
                    # print(tr)
                    returnType = tr.find_all('td', class_='colFirst')
                    method_signature = tr.find_all('code')
                    method_description = tr.find_all('div')
                    # print(class_link)
                    if len(method_signature) != 0:
                        # print(method_signature[1])
                        returnType = returnType[0].text.strip()
                        returnType = returnType.replace(u'\xa0', ' ')
                        method_name = method_signature[1].text.strip()
                        
                        method_name = method_name.replace('\n', '')
                        method_name = re.sub(' +', ' ', method_name)
                        method_name = method_name.replace(u'\xa0', ' ')
                        writer.writerow([className, method_name, returnType])
        
    else:
        print("Failed to retrieve Java API documentation.")

if __name__ == "__main__":

    csvfile = open('allPackage.csv', newline='')
    reader = csv.DictReader(csvfile)
    for row in reader:
        packageName = row['PackageName']
        name = packageName.replace(".","_")

        file = open(f'./{name}/{name}Methods.csv', 'w', newline='')
        writer = csv.writer(file)
        field = ["ClassName", "Method", "Return Type"]
        writer.writerow(field)

        csvfile_2 = open(f'./{name}/{name}Classes.csv', newline='')
        reader_2 = csv.DictReader(csvfile_2)
        for row_2 in reader_2:
            # print(row['ClassName'], row['URL'], row['Description'])
            crawl_java_util_docs(row_2['ClassName'], row_2['URL'], writer)
        print(f"Finish {packageName}")