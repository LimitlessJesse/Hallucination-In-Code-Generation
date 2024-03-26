import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_10 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        long delta = 10;
        long result = atomicLong.addAndGet(delta);
        System.out.println("Initial value: " + atomicLong.get());
        System.out.println("Delta: " + delta);
        System.out.println("Result: " + result);
    }
}
