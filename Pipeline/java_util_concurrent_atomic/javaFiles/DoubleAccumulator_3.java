import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_3 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((left, right) -> left + right, 0.0);
        accumulator.accumulate(5.0);
        accumulator.accumulate(10.0);
        System.out.println(accumulator.get()); // Outputs: 15.0
    }
}
