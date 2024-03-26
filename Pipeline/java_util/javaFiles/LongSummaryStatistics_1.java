import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatistics_1 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = LongStream.rangeClosed(1, 10)
               .summaryStatistics();
        System.out.println("Count: " + stats.getCount());
    }
}
