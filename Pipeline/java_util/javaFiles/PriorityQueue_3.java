import java.util.PriorityQueue;

public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.peek());  // Output: Hello
    }
}
