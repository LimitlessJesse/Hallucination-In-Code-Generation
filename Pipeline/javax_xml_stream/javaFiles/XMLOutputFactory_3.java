import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;

public class XMLOutputFactory_3 {
    public static void main(String[] args) throws Exception {
        XMLOutputFactory output = XMLOutputFactory.newInstance();
        StringWriter stringWriter = new StringWriter();
        XMLStreamWriter writer = output.createXMLStreamWriter(stringWriter);

        writer.writeStartDocument();
        writer.writeStartElement("root");
        writer.writeCharacters("Hello, World!");
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();

        System.out.println(stringWriter.toString());
    }
}
