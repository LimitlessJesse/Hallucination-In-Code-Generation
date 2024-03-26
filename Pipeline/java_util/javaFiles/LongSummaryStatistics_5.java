import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_5 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10);
        stats.accept(20);
        stats.accept(30);
        System.out.println("Average: " + stats.getAverage());
    }
}
