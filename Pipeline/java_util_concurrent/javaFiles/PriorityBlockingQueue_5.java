import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_5 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");

        System.out.println(queue.contains("Hello")); // Output: true
        System.out.println(queue.contains("Java")); // Output: false
    }
}
