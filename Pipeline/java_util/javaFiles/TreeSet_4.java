import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");

        System.out.println(set.contains("Hello"));  // Outputs: true
        System.out.println(set.contains("Java"));   // Outputs: false
    }
}
