import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_4 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");

        System.out.println(queue.poll());  // Output: Hello
        System.out.println(queue.poll());  // Output: World
        System.out.println(queue.poll());  // Output: null (queue is empty)
    }
}
