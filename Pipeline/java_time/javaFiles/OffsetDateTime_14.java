import java.time.OffsetDateTime;

public class OffsetDateTime_14 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        OffsetDateTime dateTimeMinusDays = dateTime.minusDays(3);
        System.out.println("Date and time minus 3 days: " + dateTimeMinusDays);
    }
}
