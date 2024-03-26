import java.security.PKCS12Attribute;

public class PKCS12Attribute_5 {
    public static void main(String[] args) {
        PKCS12Attribute attr1 = new PKCS12Attribute("attr1", "value1");
        PKCS12Attribute attr2 = new PKCS12Attribute("attr2", "value2");

        boolean isEqual = attr1.equals(attr2);

        System.out.println("Are attr1 and attr2 equal? " + isEqual);
    }
}
