import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Arrays;

public class CopyOnWriteArraySet_5 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>(Arrays.asList("Hello", "World"));
        System.out.println(set.containsAll(Arrays.asList("Hello", "World"))); // true
        System.out.println(set.containsAll(Arrays.asList("Hello", "World", "Java"))); // false
    }
}
