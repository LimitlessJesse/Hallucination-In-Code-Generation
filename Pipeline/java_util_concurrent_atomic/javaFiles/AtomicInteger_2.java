import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        int previousValue = atomicInteger.getAndIncrement();
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicInteger.get());
    }
}
