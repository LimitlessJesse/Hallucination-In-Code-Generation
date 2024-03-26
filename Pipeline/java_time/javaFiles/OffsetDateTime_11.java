import java.time.OffsetDateTime;

public class OffsetDateTime_11 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.minusYears(2);
        System.out.println("OffsetDateTime after subtracting 2 years: " + newDateTime);
    }
}
