import java.util.concurrent.Semaphore;

public class Semaphore_2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 1 acquired the permit");
                Thread.sleep(2000);
                System.out.println("Thread 1 is releasing the permit");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting for the permit");
                semaphore.acquire();
                System.out.println("Thread 2 acquired the permit");
                Thread.sleep(2000);
                System.out.println("Thread 2 is releasing the permit");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
