import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }
}
