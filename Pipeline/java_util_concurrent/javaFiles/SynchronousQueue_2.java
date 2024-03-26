import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_2 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                queue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String message = queue.take();
                System.out.println("Received message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
