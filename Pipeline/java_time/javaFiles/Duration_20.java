import java.time.Duration;

public class Duration_20 {
    public static void main(String[] args) {
        Duration duration1 = Duration.ofHours(2);
        Duration duration2 = Duration.ofHours(3);

        int result = duration1.compareTo(duration2);

        if (result < 0) {
            System.out.println("duration1 is less than duration2");
        } else if (result == 0) {
            System.out.println("duration1 is equal to duration2");
        } else {
            System.out.println("duration1 is greater than duration2");
        }
    }
}
