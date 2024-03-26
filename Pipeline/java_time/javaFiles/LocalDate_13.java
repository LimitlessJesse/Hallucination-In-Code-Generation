import java.time.LocalDate;

public class LocalDate_13 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate nextYear = today.plusYears(1);
        System.out.println("Next year: " + nextYear);
    }
}
