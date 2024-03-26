import java.time.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        long minutes = duration.toMinutes();
        System.out.println("Duration in minutes: " + minutes);
    }
}
