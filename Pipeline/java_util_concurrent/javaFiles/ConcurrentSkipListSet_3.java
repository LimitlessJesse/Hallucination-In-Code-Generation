import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_3 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        set.add("World");

        System.out.println(set.contains("Hello"));  // Outputs: true
        System.out.println(set.contains("Java"));  // Outputs: false
    }
}
