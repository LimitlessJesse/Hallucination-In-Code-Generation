import java.time.Duration;

public class Duration_3 {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        long hours = duration.toHours();
        System.out.println("Hours: " + hours);
    }
}
