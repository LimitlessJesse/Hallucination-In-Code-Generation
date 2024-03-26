import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_4 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        System.out.println("Initial value: " + atomicLong.get());

        long currentValue = atomicLong.getAndIncrement();
        System.out.println("Current value: " + currentValue);
        System.out.println("New value: " + atomicLong.get());
    }
}
