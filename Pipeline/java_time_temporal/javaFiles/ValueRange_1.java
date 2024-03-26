import java.time.temporal.ValueRange;

public class ValueRange_1 {
    public static void main(String[] args) {
        ValueRange range = ValueRange.of(1, 10);
        boolean isFixed = range.isFixed();
        System.out.println("Is the range fixed? " + isFixed);
    }
}
