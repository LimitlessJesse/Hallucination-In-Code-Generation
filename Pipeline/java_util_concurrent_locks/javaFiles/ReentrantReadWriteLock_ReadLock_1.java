import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_1 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        // Try to acquire the lock
        boolean isLocked = readLock.tryLock();

        if (isLocked) {
            // Lock is acquired
            try {
                // Perform read operation
                System.out.println("Lock is acquired and read operation is performed");
            } finally {
                // Always release the lock
                readLock.unlock();
            }
        } else {
            // Lock is not acquired
            System.out.println("Lock is not acquired");
        }
    }
}
