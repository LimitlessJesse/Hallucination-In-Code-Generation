import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println("Before removal: " + set);

        // Removing an element
        set.remove("Hello");
        System.out.println("After removal: " + set);
    }
}
