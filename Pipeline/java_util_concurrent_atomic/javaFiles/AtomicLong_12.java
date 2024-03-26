import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

public class AtomicLong_12 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        LongUnaryOperator updateFunction = operand -> operand * 2;
        long result = atomicLong.getAndUpdate(updateFunction);
        System.out.println("Initial value: " + result);
        System.out.println("Updated value: " + atomicLong.get());
    }
}
