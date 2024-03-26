import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDate_15 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextYear = today.plusYears(1);

        long years = today.until(nextYear, ChronoUnit.YEARS);
        System.out.println("Years until next year: " + years);
    }
}
