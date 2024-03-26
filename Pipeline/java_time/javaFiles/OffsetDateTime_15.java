import java.time.OffsetDateTime;

public class OffsetDateTime_15 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime: " + dateTime);

        OffsetDateTime minusHours = dateTime.minusHours(2);
        System.out.println("OffsetDateTime minus 2 hours: " + minusHours);
    }
}
