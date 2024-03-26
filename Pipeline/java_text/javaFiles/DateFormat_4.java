import java.text.DateFormat;
import java.util.Date;

public class DateFormat_4 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
