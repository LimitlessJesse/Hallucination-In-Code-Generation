import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int newValue = atomicInteger.incrementAndGet();
        System.out.println("New value: " + newValue);
    }
}
