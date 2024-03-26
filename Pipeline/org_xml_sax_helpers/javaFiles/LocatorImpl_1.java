import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_1 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setLineNumber(10);
        System.out.println(locator.getLineNumber()); // Outputs: 10
    }
}
