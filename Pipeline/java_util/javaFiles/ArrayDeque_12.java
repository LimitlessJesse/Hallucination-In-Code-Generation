import java.util.ArrayDeque;

public class ArrayDeque_12 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        deque.add("Hello");
        System.out.println("Before removal: " + deque);
        deque.removeLastOccurrence("Hello");
        System.out.println("After removal: " + deque);
    }
}
