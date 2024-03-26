import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        boolean result = queue.add("Hello");
        System.out.println("Add operation was successful: " + result);
    }
}
