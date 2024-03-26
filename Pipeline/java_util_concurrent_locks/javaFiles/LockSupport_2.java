import java.util.concurrent.locks.LockSupport;

public class LockSupport_2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is going to sleep");
            LockSupport.parkNanos(1000000000); // 1 second
            System.out.println("Thread is woken up");
        });

        thread.start();

        try {
            Thread.sleep(5000); // 500 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is going to unpark the thread");
        LockSupport.unpark(thread);
    }
}
