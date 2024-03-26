import java.time.Duration;

public class Duration_16 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        Duration multipliedDuration = duration.multipliedBy(2);
        System.out.println(multipliedDuration);
    }
}
