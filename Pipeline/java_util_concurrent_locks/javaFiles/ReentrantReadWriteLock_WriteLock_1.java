import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_WriteLock_1 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        writeLock.lock();
        try {
            // Write operations here
        } finally {
            writeLock.unlock();
        }
    }
}
