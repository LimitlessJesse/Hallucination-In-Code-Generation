import javax.xml.namespace.QName;

public class QName_1 {
    public static void main(String[] args) {
        QName qname1 = new QName("http://www.example.com/schema", "element");
        QName qname2 = new QName("http://www.example.com/schema", "element");
        QName qname3 = new QName("http://www.example.com/schema", "otherElement");

        System.out.println(qname1.equals(qname2));  // true
        System.out.println(qname1.equals(qname3));  // false
    }
}
