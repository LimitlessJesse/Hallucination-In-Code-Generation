import java.text.DateFormat;
import java.util.Date;

public class DateFormat_5 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
