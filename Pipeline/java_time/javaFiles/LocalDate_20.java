import java.time.LocalDate;

public class LocalDate_20 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Length of the year: " + lengthOfYear);
    }
}
