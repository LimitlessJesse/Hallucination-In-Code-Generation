import javax.script.SimpleBindings;

public class SimpleBindings_3 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("name", "John");
        bindings.put("age", 30);

        int size = bindings.size();
        System.out.println("Number of bindings: " + size);
    }
}
