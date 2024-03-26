import javax.naming.directory.BasicAttributes;

public class BasicAttributes_5 {
    public static void main(String[] args) {
        BasicAttributes attributes = new BasicAttributes();
        attributes.put("name", "John");
        attributes.put("age", "30");
        attributes.put("city", "New York");

        int size = attributes.size();
        System.out.println("Number of attributes: " + size);
    }
}
