import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.StringReader;

public class StAXSource_6 {
    public static void main(String[] args) {
        String xml = "<root><element>Content</element></root>";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            XMLEventReader eventReader = factory.createXMLEventReader(new StringReader(xml));
            StAXSource source = new StAXSource(eventReader);
            System.out.println(source.getSystemId());
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
