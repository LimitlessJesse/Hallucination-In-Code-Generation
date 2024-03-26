import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDate_21 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // Check if the ChronoField.DAY_OF_MONTH is supported
        boolean isDayOfMonthSupported = date.isSupported(ChronoField.DAY_OF_MONTH);
        System.out.println("Is DAY_OF_MONTH supported? " + isDayOfMonthSupported);

        // Check if the ChronoField.YEAR is supported
        boolean isYearSupported = date.isSupported(ChronoField.YEAR);
        System.out.println("Is YEAR supported? " + isYearSupported);
    }
}
