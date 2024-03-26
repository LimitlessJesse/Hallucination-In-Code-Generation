import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDate_22 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        long dayOfMonth = date.getLong(ChronoField.DAY_OF_MONTH);
        System.out.println("Day of the month: " + dayOfMonth);
    }
}
