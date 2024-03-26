import java.time.LocalDate;

public class LocalDate_9 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalDate dateAfterAddingWeeks = currentDate.plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + dateAfterAddingWeeks);
    }
}
