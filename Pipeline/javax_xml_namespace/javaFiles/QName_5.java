import javax.xml.namespace.QName;

public class QName_5 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com/book", "book", "bk");
        System.out.println("Prefix: " + qName.getPrefix());
    }
}
