import java.time.OffsetDateTime;

public class OffsetDateTime_17 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.minusSeconds(5);
        System.out.println("OffsetDateTime after subtracting 5 seconds: " + newDateTime);
    }
}
