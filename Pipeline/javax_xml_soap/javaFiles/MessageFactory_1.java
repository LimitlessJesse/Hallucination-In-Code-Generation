import javax.xml.soap.*;

public class MessageFactory_1 {
    public static void main(String[] args) {
        try {
            // Create a SOAP factory
            MessageFactory factory = MessageFactory.newInstance();

            // Create a SOAP message
            SOAPMessage message = factory.createMessage();

            // Print the message
            System.out.println(message);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
