import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class DocumentBuilder_4 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("path_to_your_xml_file.xml");
            // Now you can use the document object to navigate and manipulate the XML document.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
