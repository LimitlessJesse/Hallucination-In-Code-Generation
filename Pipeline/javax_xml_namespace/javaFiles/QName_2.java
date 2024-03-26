import javax.xml.namespace.QName;

public class QName_2 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com", "example", "example");
        int hashCode = qName.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
