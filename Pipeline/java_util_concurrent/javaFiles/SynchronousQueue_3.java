import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_3 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        // Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");

        // Retrieving and removing the head of the queue
        String element = queue.poll();

        System.out.println("Retrieved and removed element: " + element);
    }
}
