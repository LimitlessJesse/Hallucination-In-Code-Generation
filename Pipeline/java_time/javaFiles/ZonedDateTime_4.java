import java.time.ZonedDateTime;

public class ZonedDateTime_4 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        ZonedDateTime newZonedDateTime = zonedDateTime.withMonth(5);
        System.out.println("ZonedDateTime with month 5: " + newZonedDateTime);
    }
}
