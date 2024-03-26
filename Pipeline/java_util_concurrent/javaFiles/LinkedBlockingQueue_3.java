import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_3 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        boolean result = queue.offer("Hello");
        System.out.println("Element added to queue: " + result);
    }
}
