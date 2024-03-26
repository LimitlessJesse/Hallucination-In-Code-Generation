import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class TransformerFactory_2 {
    public static void main(String[] args) {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
    }
}
