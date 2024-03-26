import java.util.PriorityQueue;

public class PriorityQueue_1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        boolean result = queue.add("Hello");
        System.out.println("Element added successfully: " + result);
    }
}
