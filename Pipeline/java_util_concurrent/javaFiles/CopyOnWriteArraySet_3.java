import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_3 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
