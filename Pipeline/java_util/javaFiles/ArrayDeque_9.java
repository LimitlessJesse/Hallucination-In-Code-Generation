import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDeque_9 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        try {
            String firstElement = deque.getFirst();
            System.out.println("First element: " + firstElement);
        } catch (NoSuchElementException e) {
            System.out.println("Deque is empty");
        }
    }
}
