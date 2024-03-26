import java.util.concurrent.locks.LockSupport;

public class LockSupport_4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is waiting...");
            LockSupport.park();
            System.out.println("Thread is unparked!");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LockSupport.unpark(thread);
    }
}
