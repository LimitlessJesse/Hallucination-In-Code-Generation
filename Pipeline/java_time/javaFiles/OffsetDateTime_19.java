import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class OffsetDateTime_19 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.minus(1, ChronoUnit.DAYS);
        System.out.println("OffsetDateTime after subtracting 1 day: " + newDateTime);
    }
}
