import java.time.Duration;

public class Duration_17 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        Duration dividedDuration = duration.dividedBy(2);
        System.out.println(dividedDuration);
    }
}
