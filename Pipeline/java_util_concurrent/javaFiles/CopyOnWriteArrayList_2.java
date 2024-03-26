import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        // Retrieve the element at index 1
        String element = list.get(1);
        System.out.println(element);  // Output: World
    }
}
