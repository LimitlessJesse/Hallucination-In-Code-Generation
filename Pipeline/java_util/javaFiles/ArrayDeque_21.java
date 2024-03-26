import java.util.ArrayDeque;

public class ArrayDeque_21 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        String[] array = deque.toArray(new String[0]);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
