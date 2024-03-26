import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_2 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        System.out.println("Initial value: " + atomicBoolean.get());

        boolean result = atomicBoolean.compareAndSet(false, true);
        System.out.println("Value after compareAndSet: " + atomicBoolean.get());
        System.out.println("Result of compareAndSet: " + result);
    }
}
