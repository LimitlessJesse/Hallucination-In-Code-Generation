import java.time.OffsetDateTime;

public class OffsetDateTime_9 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusNanos(1000000000);
        System.out.println("OffsetDateTime after adding 1 second: " + newDateTime);
    }
}
