import java.time.LocalDate;

public class LocalDate_7 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
    }
}
