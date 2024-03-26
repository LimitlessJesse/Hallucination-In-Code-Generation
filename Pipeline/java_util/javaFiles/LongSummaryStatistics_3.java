import java.util.LongSummaryStatistics;

public class LongSummaryStatistics_3 {
    public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(10L);
        stats.accept(20L);
        stats.accept(30L);
        stats.accept(40L);
        stats.accept(50L);

        long min = stats.getMin();
        System.out.println("Minimum value: " + min);
    }
}
