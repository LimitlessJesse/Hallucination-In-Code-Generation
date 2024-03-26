import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_2 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((x, y) -> x + y, 0.0);
        accumulator.accumulate(1.0);
        accumulator.accumulate(2.0);
        accumulator.accumulate(3.0);
        System.out.println(accumulator.get());  // Output: 6.0
    }
}
