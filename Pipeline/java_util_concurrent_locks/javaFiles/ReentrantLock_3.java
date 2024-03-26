import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_3 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        System.out.println("Is the lock locked? " + lock.isLocked());
        lock.lock();
        System.out.println("Is the lock locked? " + lock.isLocked());
        lock.unlock();
        System.out.println("Is the lock locked? " + lock.isLocked());
    }
}
