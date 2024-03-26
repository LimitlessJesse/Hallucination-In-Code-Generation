import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_3 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.peek());  // Output: Hello
    }
}
