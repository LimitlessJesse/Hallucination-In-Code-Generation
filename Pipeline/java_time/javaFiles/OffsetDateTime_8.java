import java.time.OffsetDateTime;

public class OffsetDateTime_8 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusSeconds(10);
        System.out.println("OffsetDateTime after adding 10 seconds: " + newDateTime);
    }
}
