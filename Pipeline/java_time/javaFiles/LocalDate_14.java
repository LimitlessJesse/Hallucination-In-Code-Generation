import java.time.LocalDate;

public class LocalDate_14 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate yesterday = today.minusYears(1);
        System.out.println("Yesterday: " + yesterday);
    }
}
