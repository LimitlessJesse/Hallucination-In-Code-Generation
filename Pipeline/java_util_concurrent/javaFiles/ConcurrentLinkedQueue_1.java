import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        boolean result = queue.add("Hello");
        System.out.println("Add operation was successful: " + result);
    }
}
