import org.xml.sax.helpers.LocatorImpl;

public class LocatorImpl_3 {
    public static void main(String[] args) {
        LocatorImpl locator = new LocatorImpl();
        locator.setPublicId("publicId");
        System.out.println(locator.getPublicId());
    }
}
