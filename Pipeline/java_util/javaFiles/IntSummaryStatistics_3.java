import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_3 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = stream.summaryStatistics();
        System.out.println("Sum: " + stats.getSum());
    }
}
