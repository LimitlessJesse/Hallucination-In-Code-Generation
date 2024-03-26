import java.time.LocalDate;

public class LocalDate_12 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate oneMonthAgo = today.minusMonths(1);
        System.out.println("One month ago: " + oneMonthAgo);
    }
}
