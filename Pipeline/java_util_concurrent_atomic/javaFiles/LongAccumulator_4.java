import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_4 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(5);
        accumulator.accumulate(10);
        System.out.println("Current value: " + accumulator.get()); // Outputs: 15
        accumulator.reset();
        System.out.println("After reset: " + accumulator.get()); // Outputs: 0
    }
}
