import java.util.concurrent.locks.StampedLock;

public class StampedLock_4 {
    private final StampedLock lock = new StampedLock();

    public void write() {
        long stamp = lock.writeLock();
        try {
            // Write operation here
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.write();
    }
}
