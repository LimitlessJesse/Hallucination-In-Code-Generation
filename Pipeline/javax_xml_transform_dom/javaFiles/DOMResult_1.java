import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMResult_1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElement = document.createElement("root");
            document.appendChild(rootElement);

            DOMResult result = new DOMResult();
            result.setNode(rootElement);

            // Now you can use the result object to perform further operations

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
