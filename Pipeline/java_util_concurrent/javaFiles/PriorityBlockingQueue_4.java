import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_4 {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        queue.add("Hello");
        System.out.println("Queue before removal: " + queue);
        queue.remove("Hello");
        System.out.println("Queue after removal: " + queue);
    }
}
