import javax.naming.directory.BasicAttribute;

public class BasicAttribute_6 {
    public static void main(String[] args) {
        BasicAttribute attr1 = new BasicAttribute("cn");
        attr1.add("John Doe");

        BasicAttribute attr2 = new BasicAttribute("cn");
        attr2.add("John Doe");

        System.out.println(attr1.equals(attr2)); // Output: true
    }
}
