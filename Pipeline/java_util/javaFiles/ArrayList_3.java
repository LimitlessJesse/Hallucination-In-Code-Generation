import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Programming");

        list1.addAll(list2);

        System.out.println(list1);
    }
}
