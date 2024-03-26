import java.text.DateFormat;
import java.util.Date;

public class DateFormat_2 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        String formattedDate = df.format(date);
        System.out.println(formattedDate);
    }
}
