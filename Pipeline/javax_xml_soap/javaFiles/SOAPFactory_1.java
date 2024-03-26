import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPException;

public class SOAPFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            System.out.println(factory);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
