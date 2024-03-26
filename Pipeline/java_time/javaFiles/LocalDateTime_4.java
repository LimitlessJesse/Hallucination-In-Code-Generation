import java.time.LocalDateTime;

public class LocalDateTime_4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        LocalDateTime future = now.plusDays(10);
        System.out.println("Date and time after 10 days: " + future);
    }
}
