import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_10 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque.getLast());  // Output: World
    }
}
