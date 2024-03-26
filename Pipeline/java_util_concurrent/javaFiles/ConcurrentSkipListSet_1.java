import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_1 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        boolean result = set.add("Hello");
        System.out.println(result);  // Output: true
        result = set.add("Hello");
        System.out.println(result);  // Output: false
    }
}
