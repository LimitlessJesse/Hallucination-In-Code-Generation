import java.util.concurrent.locks.StampedLock;

public class StampedLock_3 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.readLock();
        try {
            // Perform read-only operations here
        } finally {
            lock.unlockRead(stamp);
        }
    }
}
