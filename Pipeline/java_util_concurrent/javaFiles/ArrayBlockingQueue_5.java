import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_5 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.peek());  // Output: Hello
        System.out.println(queue.peek());  // Output: Hello
    }
}
