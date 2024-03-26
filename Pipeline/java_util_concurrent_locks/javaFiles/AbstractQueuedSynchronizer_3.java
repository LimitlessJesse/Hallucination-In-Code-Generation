import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_3 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer synchronizer = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean isHeldExclusively() {
                return false;
            }
        };

        synchronizer.setState(1);
        System.out.println("State: " + synchronizer.getState());
    }
}
