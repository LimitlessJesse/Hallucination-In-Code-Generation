import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_5 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean result = atomicBoolean.weakCompareAndSet(false, true);
        System.out.println("Result: " + result);
        System.out.println("AtomicBoolean: " + atomicBoolean.get());
    }
}
