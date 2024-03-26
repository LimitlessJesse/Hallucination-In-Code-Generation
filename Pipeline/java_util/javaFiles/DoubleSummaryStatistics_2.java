import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatistics_2 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
               .summaryStatistics();
        System.out.println("Count: " + stats.getCount());
    }
}
