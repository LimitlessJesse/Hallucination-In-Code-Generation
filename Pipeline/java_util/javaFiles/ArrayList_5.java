import java.util.ArrayList;

public class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("Original list: " + list);

        // Remove the element at index 1
        list.remove(1);
        System.out.println("List after removing: " + list);
    }
}
