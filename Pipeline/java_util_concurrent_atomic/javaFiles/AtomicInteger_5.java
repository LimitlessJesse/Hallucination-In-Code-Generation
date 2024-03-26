import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_5 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        int value = atomicInteger.get();
        System.out.println("Current value: " + value);
    }
}
