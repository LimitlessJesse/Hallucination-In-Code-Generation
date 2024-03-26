import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionFactory_2 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            soapConnection.close();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
