import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_16 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        deque.add("Hello");
        System.out.println("Before removal: " + deque);
        deque.remove("Hello");
        System.out.println("After removal: " + deque);
    }
}
