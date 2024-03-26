import javax.xml.namespace.QName;

public class QName_3 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com", "localPart");
        String localPart = qName.getLocalPart();
        System.out.println("Local Part: " + localPart);
    }
}
