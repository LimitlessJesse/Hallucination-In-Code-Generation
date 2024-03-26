import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_5 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println(set.size());  // Output: 2
    }
}
