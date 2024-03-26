import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class OffsetDateTime_10 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plus(1, ChronoUnit.DAYS);
        System.out.println("OffsetDateTime after adding 1 day: " + newDateTime);
    }
}
