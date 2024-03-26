import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_5 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue);
        queue.remove("Hello");
        System.out.println(queue);
    }
}
