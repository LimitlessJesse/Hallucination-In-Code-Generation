import java.util.DoubleSummaryStatistics;

public class DoubleSummaryStatistics_5 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        stats.accept(1.0);
        stats.accept(2.0);
        stats.accept(3.0);
        stats.accept(4.0);
        stats.accept(5.0);

        double average = stats.getAverage();
        System.out.println("Average: " + average);
    }
}
