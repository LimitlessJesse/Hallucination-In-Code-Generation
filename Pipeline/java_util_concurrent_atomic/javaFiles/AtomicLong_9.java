import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_9 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long expect = 10;
        long update = 20;

        boolean result = atomicLong.compareAndSet(expect, update);

        System.out.println("Result: " + result);
        System.out.println("Current Value: " + atomicLong.get());
    }
}
