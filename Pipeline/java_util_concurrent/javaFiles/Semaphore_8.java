import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore_8 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                System.out.println("Thread 1 is waiting for a permit...");
                semaphore.acquire();
                System.out.println("Thread 1 gets a permit!");
                Thread.sleep(5000);
                System.out.println("Thread 1 releases the permit!");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting for a permit...");
                if (semaphore.tryAcquire(2, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2 gets a permit!");
                    Thread.sleep(5000);
                    System.out.println("Thread 2 releases the permit!");
                    semaphore.release();
                } else {
                    System.out.println("Thread 2 could not get a permit!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
