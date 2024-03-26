import java.time.OffsetDateTime;

public class OffsetDateTime_12 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.minusMonths(2);
        System.out.println("OffsetDateTime after subtracting 2 months: " + newDateTime);
    }
}
