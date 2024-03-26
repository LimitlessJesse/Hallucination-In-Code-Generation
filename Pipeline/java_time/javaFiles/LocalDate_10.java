import java.time.LocalDate;

public class LocalDate_10 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate oneWeekAgo = today.minusWeeks(1);
        System.out.println("One week ago: " + oneWeekAgo);
    }
}
