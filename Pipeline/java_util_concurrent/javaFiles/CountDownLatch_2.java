import java.util.concurrent.CountDownLatch;

public class CountDownLatch_2 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                latch.countDown();
                System.out.println("Thread 1 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                latch.countDown();
                System.out.println("Thread 2 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                latch.countDown();
                System.out.println("Thread 3 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        latch.await();
        System.out.println("All threads finished");
    }
}
