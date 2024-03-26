import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_8 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer aqs = new AbstractQueuedSynchronizer() {
            @Override
            protected int tryAcquireShared(int arg) {
                return 0;
            }

            @Override
            protected boolean tryReleaseShared(int arg) {
                return true;
            }
        };

        boolean hasQueuedThreads = aqs.hasQueuedThreads();
        System.out.println("Has queued threads: " + hasQueuedThreads);
    }
}
