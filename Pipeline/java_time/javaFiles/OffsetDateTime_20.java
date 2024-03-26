import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTime_20 {
    public static void main(String[] args) {
        // Create an OffsetDateTime object
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        // Change the offset of the dateTime object
        OffsetDateTime newDateTime = dateTime.withOffsetSameInstant(ZoneOffset.ofHours(-5));
        System.out.println("OffsetDateTime with new offset: " + newDateTime);
    }
}
