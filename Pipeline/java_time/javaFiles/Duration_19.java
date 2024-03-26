import java.time.Duration;

public class Duration_19 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        System.out.println("Original duration: " + duration);

        Duration negatedDuration = duration.negated();
        System.out.println("Negated duration: " + negatedDuration);
    }
}
