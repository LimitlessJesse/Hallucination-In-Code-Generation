import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        // Check if the write lock is held by the current thread
        boolean isLockHeld = writeLock.isHeldByCurrentThread();
        System.out.println("Is write lock held by current thread? " + isLockHeld);
    }
}
