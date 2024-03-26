import java.time.Duration;

public class Duration_2 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(24);
        long days = duration.toDays();
        System.out.println("Number of days: " + days);
    }
}
