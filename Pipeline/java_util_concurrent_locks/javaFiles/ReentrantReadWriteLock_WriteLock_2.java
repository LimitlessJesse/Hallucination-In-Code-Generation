import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        // Try to acquire the write lock
        boolean isLocked = writeLock.tryLock();

        if (isLocked) {
            // If the lock is acquired, do something
            System.out.println("Write lock acquired");

            // Release the lock
            writeLock.unlock();
        } else {
            // If the lock is not acquired, do something else
            System.out.println("Write lock not acquired");
        }
    }
}
