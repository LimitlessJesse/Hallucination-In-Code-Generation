import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLock_ReadLock_5 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        ReentrantReadWriteLock.Condition condition = readLock.newCondition();

        // You can use the condition to block the current thread
        try {
            readLock.lock();
            condition.await(); // This will block the current thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }
}
