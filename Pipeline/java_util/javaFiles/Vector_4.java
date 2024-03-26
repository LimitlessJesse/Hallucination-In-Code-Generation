import java.util.Vector;

public class Vector_4 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");

        System.out.println(vector.contains("Hello"));  // Outputs: true
        System.out.println(vector.contains("Java"));  // Outputs: false
    }
}
