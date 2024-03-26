import java.time.OffsetDateTime;

public class OffsetDateTime_3 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusMonths(2);
        System.out.println("OffsetDateTime after adding 2 months: " + newDateTime);
    }
}
