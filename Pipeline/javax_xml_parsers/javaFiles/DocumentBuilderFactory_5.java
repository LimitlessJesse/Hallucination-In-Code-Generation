import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_5 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setAttribute("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
    }
}
