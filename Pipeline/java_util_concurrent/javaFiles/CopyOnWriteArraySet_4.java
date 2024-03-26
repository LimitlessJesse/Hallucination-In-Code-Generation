import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_4 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");

        System.out.println(set.contains("Hello"));  // Outputs: true
        System.out.println(set.contains("Java"));   // Outputs: false
    }
}
