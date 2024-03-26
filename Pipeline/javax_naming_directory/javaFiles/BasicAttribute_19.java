import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

public class BasicAttribute_19 {
    public static void main(String[] args) {
        BasicAttribute attr = new BasicAttribute("attrName");
        attr.add("value1");
        attr.add("value2");
        attr.add("value3");

        int size = attr.size();
        System.out.println("Size of attribute: " + size);
    }
}
