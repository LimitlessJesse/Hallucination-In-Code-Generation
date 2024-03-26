import java.time.OffsetDateTime;

public class OffsetDateTime_6 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + offsetDateTime);

        OffsetDateTime offsetDateTimePlusHours = offsetDateTime.plusHours(2);
        System.out.println("OffsetDateTime after adding 2 hours: " + offsetDateTimePlusHours);
    }
}
