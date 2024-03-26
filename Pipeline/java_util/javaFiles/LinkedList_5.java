import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original list: " + list);

        list.set(1, "Java");
        System.out.println("Updated list: " + list);
    }
}
