import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialList_3 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original list: " + list);

        list.set(1, "Java");
        System.out.println("Updated list: " + list);
    }
}
