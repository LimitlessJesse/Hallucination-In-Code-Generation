import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrier_3 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        new Thread(() -> {
            try {
                System.out.println("Thread 1 is waiting");
                barrier.await(10, TimeUnit.SECONDS);
                System.out.println("Thread 1 is released");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting");
                barrier.await(10, TimeUnit.SECONDS);
                System.out.println("Thread 2 is released");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 3 is waiting");
                barrier.await(10, TimeUnit.SECONDS);
                System.out.println("Thread 3 is released");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
