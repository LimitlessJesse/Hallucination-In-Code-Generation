import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        // Try to acquire the lock
        boolean isLocked = lock.tryLock();

        if (isLocked) {
            try {
                // Perform operations here
                System.out.println("Lock acquired. Performing operations...");
            } finally {
                // Always release the lock
                lock.unlock();
            }
        } else {
            System.out.println("Lock not acquired. Someone else is using the resource.");
        }
    }
}
