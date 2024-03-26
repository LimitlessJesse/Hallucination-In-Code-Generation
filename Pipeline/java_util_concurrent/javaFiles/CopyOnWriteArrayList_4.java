import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(1, "Java");
        System.out.println(list);
    }
}
