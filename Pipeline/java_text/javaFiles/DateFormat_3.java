import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat_3 {
    public static void main(String[] args) {
        int style = DateFormat.FULL;
        Locale locale = new Locale("en", "US");

        DateFormat dateFormat = DateFormat.getDateInstance(style, locale);
        Date date = new Date();

        String formattedDate = dateFormat.format(date);

        System.out.println(formattedDate);
    }
}
