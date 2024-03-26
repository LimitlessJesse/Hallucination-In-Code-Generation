import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");

        LinkedList<String> otherList = new LinkedList<>(Arrays.asList("Java", "Programming"));

        list.addAll(otherList);

        System.out.println(list);
    }
}
