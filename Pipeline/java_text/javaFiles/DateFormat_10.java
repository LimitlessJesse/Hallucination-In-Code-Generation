import java.text.DateFormat;
import java.util.Date;

public class DateFormat_10 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getInstance();
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
