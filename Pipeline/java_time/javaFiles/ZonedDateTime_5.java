import java.time.ZonedDateTime;

public class ZonedDateTime_5 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        ZonedDateTime newZonedDateTime = zonedDateTime.withDayOfMonth(15);
        System.out.println("ZonedDateTime with changed day of month: " + newZonedDateTime);
    }
}
