import java.util.AbstractSequentialList;
import java.util.ArrayList;

public class AbstractSequentialList_2 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Retrieve the element at index 0
        String element = list.get(0);
        System.out.println(element);  // Output: Hello
    }
}
