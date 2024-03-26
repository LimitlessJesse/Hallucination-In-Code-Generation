import java.time.Duration;

public class Duration_18 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        Duration absDuration = duration.abs();
        System.out.println(absDuration);
    }
}
