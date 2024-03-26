import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XPathFactory_2 {
    public static void main(String[] args) {
        try {
            // Create a new DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse an XML file into a Document
            Document document = builder.parse(new File("path_to_your_xml_file.xml"));

            // Create a new XPathFactory
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();

            // Create an XPath Expression
            String expression = "/root/child";

            // Evaluate the XPath Expression
            NodeList nodeList = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

            // Print the Nodes
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
