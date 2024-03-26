import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_3 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
