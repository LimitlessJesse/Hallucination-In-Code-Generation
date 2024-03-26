import java.time.OffsetDateTime;

public class OffsetDateTime_13 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime: " + dateTime);

        OffsetDateTime minusWeeks = dateTime.minusWeeks(2);
        System.out.println("OffsetDateTime after subtracting 2 weeks: " + minusWeeks);
    }
}
