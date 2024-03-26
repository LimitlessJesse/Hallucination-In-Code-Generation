import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_2 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("Hello");
        System.out.println(queue);
    }
}
