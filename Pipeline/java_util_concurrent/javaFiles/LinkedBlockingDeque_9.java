import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDeque_9 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        deque.add("Third");

        try {
            System.out.println("First element: " + deque.getFirst());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
