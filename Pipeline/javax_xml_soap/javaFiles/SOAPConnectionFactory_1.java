import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionFactory_1 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            // Use soapConnection for sending and receiving SOAP messages
            soapConnection.close();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
