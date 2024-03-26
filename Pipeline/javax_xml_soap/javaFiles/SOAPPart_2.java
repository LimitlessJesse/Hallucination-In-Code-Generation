import javax.xml.soap.*;

public class SOAPPart_2 {
    public static void main(String[] args) {
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            SOAPMessage message = factory.createMessage();
            SOAPPart part = message.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();

            // Now you can use the envelope to add or manipulate SOAP elements
            // For example, you can add a header to the envelope
            SOAPHeader header = envelope.getHeader();
            SOAPElement element = envelope.createElement("MyHeader");
            header.addChildElement(element);

            // Or you can add a body to the envelope
            SOAPBody body = envelope.getBody();
            SOAPElement bodyElement = envelope.createElement("MyBody");
            body.addBodyElement(bodyElement);

            // You can also create a new envelope
            SOAPEnvelope newEnvelope = factory.createSOAPEnvelope();
            part.setEnvelope(newEnvelope);

        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
