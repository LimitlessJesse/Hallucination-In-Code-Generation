import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_3 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("attr");
        attribute.add("value1");
        attribute.add("value2");
        System.out.println("Before clear: " + attribute);
        attribute.clear();
        System.out.println("After clear: " + attribute);
    }
}
