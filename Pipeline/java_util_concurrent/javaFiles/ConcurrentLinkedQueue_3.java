import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_3 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Hello");
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
