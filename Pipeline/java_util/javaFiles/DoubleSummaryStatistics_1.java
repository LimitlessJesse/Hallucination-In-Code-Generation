import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_1 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(1.0);
        stats.accept(2.0);
        stats.accept(3.0);
        System.out.println(stats.getSum());
    }
}
