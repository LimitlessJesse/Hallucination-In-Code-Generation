import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class ZoneRules_3 {
    public static void main(String[] args) {
        ZoneRules zoneRules = ZoneRules.of("America/New_York");
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneOffset offset = zoneRules.getOffset(dateTime);
        System.out.println("The offset for the given date and time is: " + offset);
    }
}
