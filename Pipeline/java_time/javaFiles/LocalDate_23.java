import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_23 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate nextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + nextMonth);
    }
}
