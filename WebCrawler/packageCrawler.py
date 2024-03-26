import requests
from bs4 import BeautifulSoup
import re
import csv

def crawl_java_docs():

    url = "https://docs.oracle.com/javase/8/docs/api/overview-summary.html"

    # Send a GET request to the API documentation URL
    response = requests.get(url)
    
    if response.status_code == 200:
        file = open('allPackage.csv', 'w', newline='')
        writer = csv.writer(file)
        field = ["PackageName", "URL"]
        writer.writerow(field)

        # Parse the HTML content
        soup = BeautifulSoup(response.text, 'html.parser')
        
        # print(soup)
        

        tables = soup.find_all('table', class_='overviewSummary')

        for table in tables:
            if table.has_attr('summary') and table['summary'] == 'Packages table, listing packages, and an explanation':
                for tr in table.find_all('tr'):
                    # print(tr)
                    class_link = tr.find_all('a', href=True)

                    # print(class_link)
                    if len(class_link) != 0:
                        package_name = class_link[0].text.strip()
                        urlName = package_name.replace(".","/")
                        writer.writerow([package_name, f"https://docs.oracle.com/javase/8/docs/api/{urlName}/package-summary.html"])

        # for tr in soup.find('table', class_='data').find_all('tr'):
        
    else:
        print("Failed to retrieve Java API documentation.")

if __name__ == "__main__":
    crawl_java_docs()