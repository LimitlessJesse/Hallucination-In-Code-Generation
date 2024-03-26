import java.time.LocalDate;

public class LocalDate_5 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int dayOfMonth = today.getDayOfMonth();
        System.out.println("Today's day of the month is: " + dayOfMonth);
    }
}
