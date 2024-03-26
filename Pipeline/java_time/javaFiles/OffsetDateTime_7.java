import java.time.OffsetDateTime;

public class OffsetDateTime_7 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusMinutes(30);
        System.out.println("OffsetDateTime after adding 30 minutes: " + newDateTime);
    }
}
