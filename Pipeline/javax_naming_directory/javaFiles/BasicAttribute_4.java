import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_4 {
    public static void main(String[] args) {
        BasicAttribute attr = new BasicAttribute("attrName");
        attr.add("value1");
        attr.add("value2");

        System.out.println(attr.contains("value1")); // prints: true
        System.out.println(attr.contains("value3")); // prints: false
    }
}
