import java.util.Hashtable;

public class Hashtable_1 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "Hello");
        hashtable.put("2", "World");

        System.out.println(hashtable.contains("Hello")); // Output: false
        System.out.println(hashtable.contains("1")); // Output: true
    }
}
