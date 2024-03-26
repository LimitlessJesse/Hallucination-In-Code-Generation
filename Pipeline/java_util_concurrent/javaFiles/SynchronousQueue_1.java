import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_1 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        try {
            queue.offer("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
