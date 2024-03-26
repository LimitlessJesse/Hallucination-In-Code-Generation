import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDeque_10 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");

        try {
            String lastElement = deque.getLast();
            System.out.println("Last element: " + lastElement);
        } catch (NoSuchElementException e) {
            System.out.println("Deque is empty");
        }
    }
}
