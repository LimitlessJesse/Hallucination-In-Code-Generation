import java.time.OffsetDateTime;

public class OffsetDateTime_16 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        OffsetDateTime minusMinutes = dateTime.minusMinutes(5);
        System.out.println("Date and time minus 5 minutes: " + minusMinutes);
    }
}
