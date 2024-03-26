import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_3 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        try {
            queue.put("Hello");
            String element = queue.take();
            System.out.println("Element: " + element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
