import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Semaphore_10 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                System.out.println("Thread 1 is waiting for a permit");
                semaphore.acquire();
                System.out.println("Thread 1 gets a permit");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1 is performing operation " + (i + 1));
                }
                System.out.println("Thread 1 releases the permit");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting for a permit");
                if (semaphore.tryAcquire(1, 5, TimeUnit.SECONDS)) {
                    System.out.println("Thread 2 gets a permit");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 2 is performing operation " + (i + 1));
                    }
                    System.out.println("Thread 2 releases the permit");
                    semaphore.release();
                } else {
                    System.out.println("Thread 2 could not get a permit");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
