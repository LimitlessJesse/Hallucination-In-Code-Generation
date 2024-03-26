import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_1 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer synchronizer = new AbstractQueuedSynchronizer() {
            @Override
            protected int tryAcquireShared(int arg) {
                return getState();
            }
        };

        int state = synchronizer.tryAcquireShared(1);
        System.out.println("Current state: " + state);
    }
}
