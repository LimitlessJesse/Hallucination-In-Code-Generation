import java.util.PriorityQueue;

public class PriorityQueue_4 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        boolean result = queue.offer("Hello");
        System.out.println("Element added successfully: " + result);
    }
}
