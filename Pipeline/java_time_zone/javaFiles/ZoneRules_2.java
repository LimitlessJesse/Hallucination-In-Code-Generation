import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneRules_2 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZoneRules zoneRules = zoneId.getRules();
        Instant instant = Instant.now();
        ZoneOffset zoneOffset = zoneRules.getOffset(instant);
        System.out.println("Current offset for " + zoneId + " is " + zoneOffset);
    }
}
