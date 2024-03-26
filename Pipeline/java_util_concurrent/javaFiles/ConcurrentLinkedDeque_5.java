import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDeque_5 {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque.getLast());  // Output: World
    }
}
