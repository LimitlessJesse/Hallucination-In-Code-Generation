import java.time.LocalDateTime;

public class LocalDateTime_5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("Current day of the month: " + dayOfMonth);
    }
}
