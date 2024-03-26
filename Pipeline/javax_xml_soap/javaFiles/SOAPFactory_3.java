import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPException;

public class SOAPFactory_3 {
    public static void main(String[] args) {
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            QName qname = new QName("http://www.example.com/", "elementName");
            SOAPElement element = factory.createElement(qname);
            System.out.println(element);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
