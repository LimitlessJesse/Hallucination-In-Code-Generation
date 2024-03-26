import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime_2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        System.out.println(zonedDateTime);
    }
}
