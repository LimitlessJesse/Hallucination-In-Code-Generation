import java.time.LocalDate;

public class LocalDate_3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        System.out.println("Current Year: " + year);
    }
}
