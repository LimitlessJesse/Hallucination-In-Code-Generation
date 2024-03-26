import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_5 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        try {
            queue.put("Hello");
            queue.put("World");
            System.out.println("Size of queue: " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
