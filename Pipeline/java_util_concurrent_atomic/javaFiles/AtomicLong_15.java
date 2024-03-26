import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_15 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);

        atomicLong.accumulateAndGet(10, (left, right) -> left + right);
        System.out.println(atomicLong.get()); // Output: 10

        atomicLong.accumulateAndGet(20, (left, right) -> left + right);
        System.out.println(atomicLong.get()); // Output: 30
    }
}
