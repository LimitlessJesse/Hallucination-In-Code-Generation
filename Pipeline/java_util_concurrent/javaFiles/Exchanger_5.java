import java.util.concurrent.Exchanger;

public class Exchanger_5 {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello");
                System.out.println("Thread 1 received: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        String message = exchanger.exchange("World");
        System.out.println("Thread 2 received: " + message);
    }
}
