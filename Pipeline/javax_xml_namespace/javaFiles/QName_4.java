import javax.xml.namespace.QName;

public class QName_4 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com", "example", "ex");
        String namespaceURI = qName.getNamespaceURI();
        System.out.println("Namespace URI: " + namespaceURI);
    }
}
