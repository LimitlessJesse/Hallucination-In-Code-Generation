import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_2 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.poll()); // Output: Hello
        System.out.println(queue.poll()); // Output: World
        System.out.println(queue.poll()); // Output: null
    }
}
