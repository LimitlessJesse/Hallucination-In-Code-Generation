import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_6 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        System.out.println("Initial value: " + atomicLong.get());
        System.out.println("Incremented value: " + atomicLong.incrementAndGet());
    }
}
