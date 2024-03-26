import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_4 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        boolean isValidating = factory.getFeature("http://apache.org/xml/features/validation/schema");
        System.out.println("Is Validating: " + isValidating);
    }
}
