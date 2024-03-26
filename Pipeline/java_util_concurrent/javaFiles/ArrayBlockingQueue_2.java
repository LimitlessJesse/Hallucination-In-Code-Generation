import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        boolean result = queue.offer("Hello");
        System.out.println("Element added to queue: " + result);
    }
}
