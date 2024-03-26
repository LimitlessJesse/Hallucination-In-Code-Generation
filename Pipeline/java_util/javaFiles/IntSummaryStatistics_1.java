import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatistics_1 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = stream.summaryStatistics();
        long count = stats.getCount();
        System.out.println("Count: " + count);
    }
}
