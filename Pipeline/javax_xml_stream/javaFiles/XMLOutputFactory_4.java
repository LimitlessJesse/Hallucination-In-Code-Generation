import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class XMLOutputFactory_4 {
    public static void main(String[] args) throws Exception {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        OutputStream output = new FileOutputStream("output.xml");
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(output, "UTF-8");

        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("root");
        writer.writeCharacters("Hello, World!");
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();
    }
}
