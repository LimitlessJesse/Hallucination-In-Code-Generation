import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_6 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");

        System.out.println(deque.poll());  // Output: Hello
        System.out.println(deque.poll());  // Output: World
        System.out.println(deque.poll());  // Output: null
    }
}
