import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_4 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        // Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Retrieving and removing the head of the queue
        String element = queue.poll();
        System.out.println("Retrieved and removed element: " + element);

        // Printing the queue after poll()
        System.out.println("Queue after poll(): " + queue);
    }
}
