import java.time.ZonedDateTime;

public class ZonedDateTime_3 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Original ZonedDateTime: " + zonedDateTime);

        ZonedDateTime newZonedDateTime = zonedDateTime.withYear(2022);
        System.out.println("ZonedDateTime with new year: " + newZonedDateTime);
    }
}
