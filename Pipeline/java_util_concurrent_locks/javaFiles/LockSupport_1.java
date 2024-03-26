import java.util.concurrent.locks.LockSupport;

public class LockSupport_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is going to sleep");
            LockSupport.park();
            System.out.println("Thread is awakened");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is going to unpark the thread");
        LockSupport.unpark(thread);
    }
}
