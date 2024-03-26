import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_4 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer sync = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean tryAcquire(int arg) {
                return super.tryAcquire(arg);
            }
        };

        boolean acquired = sync.tryAcquire(1);
        System.out.println("Lock acquired: " + acquired);
    }
}
