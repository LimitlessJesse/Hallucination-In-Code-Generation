import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_4 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        boolean result = atomicInteger.compareAndSet(10, 20);
        System.out.println("Result: " + result);
        System.out.println("Value: " + atomicInteger.get());
    }
}
