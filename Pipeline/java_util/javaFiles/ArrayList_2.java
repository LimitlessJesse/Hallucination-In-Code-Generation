import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(1, "Java");
        System.out.println(list);
    }
}
