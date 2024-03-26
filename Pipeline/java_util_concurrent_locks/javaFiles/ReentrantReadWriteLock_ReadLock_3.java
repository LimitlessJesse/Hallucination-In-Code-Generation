import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_3 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        try {
            if (readLock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println("Lock acquired");
                // Perform read operation
            } else {
                System.out.println("Unable to acquire lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }
}
