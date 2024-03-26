import java.time.OffsetDateTime;

public class OffsetDateTime_5 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusDays(1);
        System.out.println("OffsetDateTime after adding 1 day: " + newDateTime);
    }
}
