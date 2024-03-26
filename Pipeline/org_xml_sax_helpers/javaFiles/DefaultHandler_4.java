import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    private StringBuilder currentValue = new StringBuilder();

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element : " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentValue.append(ch, start, length);
    }
}
