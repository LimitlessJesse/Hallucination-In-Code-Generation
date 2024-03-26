import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean result = set.add("Hello");
        System.out.println(result);  // Output: true
        System.out.println(set);  // Output: [Hello]
    }
}
