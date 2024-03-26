import java.util.PriorityQueue;

public class PriorityQueue_5 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println("Queue: " + queue);

        String head = queue.poll();
        System.out.println("Removed element: " + head);
        System.out.println("Queue after poll: " + queue);
    }
}
