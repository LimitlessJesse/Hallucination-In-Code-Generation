import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");

        System.out.println(set.contains("Hello"));  // Outputs: true
        System.out.println(set.contains("Java"));  // Outputs: false
    }
}
