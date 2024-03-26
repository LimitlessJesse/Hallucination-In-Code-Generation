import java.util.concurrent.atomic.LongAdder;

public class LongAdder_3 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        adder.increment();
        System.out.println("Current value: " + adder.longValue());
        adder.reset();
        System.out.println("After reset: " + adder.longValue());
    }
}
