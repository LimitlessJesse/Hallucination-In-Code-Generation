import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_5 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long currentValue = atomicLong.getAndDecrement();
        System.out.println("Current Value: " + currentValue);
        System.out.println("New Value: " + atomicLong.get());
    }
}
