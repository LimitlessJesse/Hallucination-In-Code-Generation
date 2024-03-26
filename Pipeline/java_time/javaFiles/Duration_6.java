import java.time.Duration;

public class Duration_6 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        long millis = duration.toMillis();
        System.out.println("Duration in milliseconds: " + millis);
    }
}
