import java.text.DateFormat;
import java.util.Date;

public class DateFormat_1 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
