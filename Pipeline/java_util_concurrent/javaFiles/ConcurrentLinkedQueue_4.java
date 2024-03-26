import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_4 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.peek());  // Output: Hello
        System.out.println(queue.peek());  // Output: Hello
    }
}
