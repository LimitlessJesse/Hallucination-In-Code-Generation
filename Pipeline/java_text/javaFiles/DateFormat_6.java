import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat_6 {
    public static void main(String[] args) {
        int dateStyle = DateFormat.FULL;
        int timeStyle = DateFormat.FULL;
        Locale locale = new Locale("en", "US");

        Date currentDate = new Date();
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale);

        String formattedDate = dateTimeInstance.format(currentDate);
        System.out.println(formattedDate);
    }
}
