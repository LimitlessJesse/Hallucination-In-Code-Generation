import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_3 {
    public static void main(String[] args) {
        String dateTime = "2022-01-01T10:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime, formatter);
        System.out.println(parsedDateTime);
    }
}
