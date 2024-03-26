import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_2 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            // Critical section of code
        } finally {
            lock.unlock();
        }
    }
}
