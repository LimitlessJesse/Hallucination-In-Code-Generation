import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_2 {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer aqs = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean compareAndSetState(int expect, int update) {
                return super.compareAndSetState(expect, update);
            }
        };

        int expect = 0;
        int update = 1;
        boolean result = aqs.compareAndSetState(expect, update);
        System.out.println("Result: " + result);
    }
}
