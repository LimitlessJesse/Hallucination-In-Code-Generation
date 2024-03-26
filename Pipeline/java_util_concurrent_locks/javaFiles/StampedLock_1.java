import java.util.concurrent.locks.StampedLock;

public class StampedLock_1 {
    public static void main(String[] args) {
        StampedLock lock = new StampedLock();
        long stamp = lock.tryOptimisticRead();
        if (stamp!= -1L) {
            // Perform read operation
            System.out.println("Read operation performed successfully");
            lock.validate(stamp);
        } else {
            // Lock is contended, perform alternative action
            System.out.println("Lock is contended, performing alternative action");
        }
    }
}
