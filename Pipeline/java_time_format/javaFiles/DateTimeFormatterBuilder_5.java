import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatterBuilder_5 {
    public static void main(String[] args) {
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.parseCaseInsensitive();
        DateTimeFormatter formatter = builder.toFormatter();

        String dateTimeString = "2022-01-01T12:00:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println(dateTime);
    }
}
