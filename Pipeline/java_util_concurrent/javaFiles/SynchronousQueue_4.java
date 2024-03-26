import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_4 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        System.out.println(queue.isEmpty()); // true

        queue.offer("Hello");
        System.out.println(queue.isEmpty()); // false
    }
}
