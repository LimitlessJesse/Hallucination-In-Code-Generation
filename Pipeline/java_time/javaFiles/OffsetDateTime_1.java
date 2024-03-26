import java.time.OffsetDateTime;

public class OffsetDateTime_1 {
    public static void main(String[] args) {
        String dateTime = "2022-01-01T10:15:30+05:30";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTime);
        System.out.println(offsetDateTime);
    }
}
