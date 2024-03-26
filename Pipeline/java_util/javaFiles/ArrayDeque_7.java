import java.util.ArrayDeque;

public class ArrayDeque_7 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        System.out.println("Deque: " + deque);

        String firstElement = deque.pollFirst();
        System.out.println("Removed first element: " + firstElement);

        System.out.println("Updated Deque: " + deque);
    }
}
