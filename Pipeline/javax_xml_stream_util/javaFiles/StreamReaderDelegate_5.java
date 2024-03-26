import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_5 {
    public static void main(String[] args) throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new java.io.StringReader("<root attr1='val1' attr2='val2' />"));
        StreamReaderDelegate delegate = new StreamReaderDelegate(reader) {
            @Override
            public int getAttributeCount() {
                return super.getAttributeCount();
            }
        };

        while (delegate.hasNext()) {
            int event = delegate.next();
            if (event == XMLStreamReader.START_ELEMENT) {
                System.out.println("Start element: " + delegate.getLocalName());
                System.out.println("Attribute count: " + delegate.getAttributeCount());
            }
        }
    }
}
