import java.time.Duration;

public class Duration_14 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofHours(2);
        Duration duration2 = Duration.ofMinutes(30);

        Duration duration3 = duration1.plus(duration2);

        System.out.println("Duration 1: " + duration1);
        System.out.println("Duration 2: " + duration2);
        System.out.println("Duration 1 + Duration 2: " + duration3);
    }
}
