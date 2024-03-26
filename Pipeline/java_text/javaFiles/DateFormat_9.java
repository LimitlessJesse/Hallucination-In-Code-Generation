import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat_9 {
    public static void main(String[] args) {
        int style = DateFormat.MEDIUM;
        Locale locale = Locale.US;

        DateFormat timeInstance = DateFormat.getTimeInstance(style, locale);
        Date date = new Date();

        String formattedTime = timeInstance.format(date);
        System.out.println(formattedTime);
    }
}
