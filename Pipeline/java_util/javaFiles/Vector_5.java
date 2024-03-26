import java.util.Vector;

public class Vector_5 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");

        // Get the element at index 1
        String element = vector.get(1);
        System.out.println(element);  // Output: World
    }
}
