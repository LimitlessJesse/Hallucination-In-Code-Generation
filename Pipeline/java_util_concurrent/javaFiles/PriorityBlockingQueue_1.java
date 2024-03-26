import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_1 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        boolean result = queue.add("Hello");
        System.out.println("Element added successfully: " + result);
    }
}
