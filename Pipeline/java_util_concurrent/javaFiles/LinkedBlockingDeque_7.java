import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_7 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        System.out.println("Deque: " + deque);

        String firstElement = deque.pollFirst();
        System.out.println("Removed first element: " + firstElement);

        System.out.println("Updated Deque: " + deque);
    }
}
