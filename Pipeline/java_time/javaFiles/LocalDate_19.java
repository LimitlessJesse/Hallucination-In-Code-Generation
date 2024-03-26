import java.time.LocalDate;

public class LocalDate_19 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 2, 15); // February 2022
        int daysInMonth = date.lengthOfMonth();
        System.out.println("Number of days in the month: " + daysInMonth);
    }
}
