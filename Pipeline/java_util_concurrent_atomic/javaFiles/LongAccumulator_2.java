import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_2 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(5);
        accumulator.accumulate(10);
        System.out.println(accumulator.get()); // Output: 15
    }
}
