import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.FileInputStream;
import java.io.InputStream;

public class DocumentBuilder_7 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputStream stream = new FileInputStream("path_to_your_xml_file.xml");
            Document document = builder.parse(stream);
            // Now you can use the document object to parse the XML
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
