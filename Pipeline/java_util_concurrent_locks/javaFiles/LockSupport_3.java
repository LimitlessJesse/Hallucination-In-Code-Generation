import java.util.concurrent.locks.LockSupport;

public class LockSupport_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is going to sleep");
            LockSupport.parkUntil(System.currentTimeMillis() + 3000);
            System.out.println("Thread is woken up");
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is going to unpark the thread");
        LockSupport.unpark(thread);
    }
}
