import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDate_25 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Original date: " + date);

        LocalDate newDate = date.with(ChronoField.DAY_OF_MONTH, 15);
        System.out.println("Date with changed day of month: " + newDate);
    }
}
