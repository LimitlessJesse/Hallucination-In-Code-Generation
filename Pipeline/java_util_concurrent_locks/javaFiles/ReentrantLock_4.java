import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_4 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        System.out.println(lock.isHeldByCurrentThread());
        lock.unlock();
        System.out.println(lock.isHeldByCurrentThread());
    }
}
