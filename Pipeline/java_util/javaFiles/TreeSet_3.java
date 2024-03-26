import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
