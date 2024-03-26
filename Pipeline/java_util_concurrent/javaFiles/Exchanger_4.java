import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Exchanger_4 {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello", 1, TimeUnit.SECONDS);
                System.out.println("Received: " + message);
            } catch (InterruptedException | TimeoutException e) {
                e.printStackTrace();
            }
        }).start();

        String message = exchanger.exchange("World", 1, TimeUnit.SECONDS);
        System.out.println("Sent: " + message);
    }
}
