import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_14 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long result = atomicLong.getAndAccumulate(5, (left, right) -> left + right);
        System.out.println("Initial value: " + atomicLong.get());
        System.out.println("Result: " + result);
    }
}
