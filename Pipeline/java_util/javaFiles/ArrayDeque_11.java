import java.util.ArrayDeque;

public class ArrayDeque_11 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        deque.add("Hello");
        System.out.println("Before removal: " + deque);
        deque.removeFirstOccurrence("Hello");
        System.out.println("After removal: " + deque);
    }
}
