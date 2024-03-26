import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_1 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        System.out.println(set);
    }
}
