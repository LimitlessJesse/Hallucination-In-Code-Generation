import java.time.OffsetDateTime;

public class OffsetDateTime_18 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.minusNanos(1000000000);
        System.out.println("OffsetDateTime after subtracting nanos: " + newDateTime);
    }
}
