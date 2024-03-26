import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DocumentBuilder_3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Create a File object
            File file = new File("your_file.xml");

            // Create an InputStream
            InputStream inputStream = new FileInputStream(file);

            // Create a Reader
            Reader reader = new InputStreamReader(inputStream);

            // Parse the XML document
            Document document = builder.parse(reader);

            // Print the document
            System.out.println(document.getDocumentElement().getNodeName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
