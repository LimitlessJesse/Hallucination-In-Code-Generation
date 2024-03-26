import java.util.concurrent.locks.StampedLock;

public class StampedLock_2 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.readLock();
        try {
            // Perform read operation here
        } finally {
            lock.unlockRead(stamp);
        }
    }
}
