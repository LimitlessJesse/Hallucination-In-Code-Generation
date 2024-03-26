import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_8 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque.pollLast());  // Output: World
        System.out.println(deque.pollLast());  // Output: Hello
        System.out.println(deque.pollLast());  // Output: null (deque is empty)
    }
}
