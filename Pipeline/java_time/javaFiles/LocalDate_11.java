import java.time.LocalDate;

public class LocalDate_11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("Next month: " + nextMonth);
    }
}
