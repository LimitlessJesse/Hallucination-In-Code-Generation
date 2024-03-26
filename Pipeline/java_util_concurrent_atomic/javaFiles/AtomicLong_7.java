import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_7 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long result = atomicLong.decrementAndGet();
        System.out.println("Result: " + result);
    }
}
