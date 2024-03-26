import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

public class XMLOutputFactory_1 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(System.out);

            writer.writeStartDocument();
            writer.writeStartElement("root");
            writer.writeCharacters("Hello, World!");
            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
