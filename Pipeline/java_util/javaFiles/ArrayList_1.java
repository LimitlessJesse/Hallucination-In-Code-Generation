import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean result = list.add("Hello");
        System.out.println(result);  // Output: true
        System.out.println(list);  // Output: [Hello]
    }
}
