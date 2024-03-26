import java.time.OffsetDateTime;

public class OffsetDateTime_4 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusWeeks(2);
        System.out.println("OffsetDateTime after adding 2 weeks: " + newDateTime);
    }
}
