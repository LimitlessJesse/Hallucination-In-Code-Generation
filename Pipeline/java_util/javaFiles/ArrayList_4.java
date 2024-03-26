import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Get the element at index 1
        String element = list.get(1);
        System.out.println(element);  // Output: World
    }
}
