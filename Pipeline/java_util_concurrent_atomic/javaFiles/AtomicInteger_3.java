import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_3 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int previousValue = atomicInteger.getAndAdd(3);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
