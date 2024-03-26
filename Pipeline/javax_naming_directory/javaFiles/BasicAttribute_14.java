import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_14 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("attributeName");
        attribute.add("value1");
        attribute.add("value2");
        attribute.add("value3");

        System.out.println("Before removing: " + attribute);

        boolean isRemoved = attribute.remove("value2");

        System.out.println("After removing: " + attribute);
        System.out.println("Is removed? " + isRemoved);
    }
}
