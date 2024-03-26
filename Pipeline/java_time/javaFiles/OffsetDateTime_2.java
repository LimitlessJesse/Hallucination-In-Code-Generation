import java.time.OffsetDateTime;

public class OffsetDateTime_2 {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println("Original OffsetDateTime: " + dateTime);

        OffsetDateTime newDateTime = dateTime.plusYears(2);
        System.out.println("OffsetDateTime after adding 2 years: " + newDateTime);
    }
}
