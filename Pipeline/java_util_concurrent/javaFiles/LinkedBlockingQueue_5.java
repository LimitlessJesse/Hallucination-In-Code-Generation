import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_5 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.peek());  // Output: Hello
        System.out.println(queue.peek());  // Output: Hello
    }
}
