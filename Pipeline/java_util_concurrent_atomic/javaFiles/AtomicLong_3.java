import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_3 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long newValue = 20;
        long oldValue = atomicLong.getAndSet(newValue);
        System.out.println("Old value: " + oldValue);
        System.out.println("New value: " + atomicLong.get());
    }
}
