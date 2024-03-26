import java.text.DateFormat;
import java.util.Date;

public class DateFormat_8 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.SHORT);
        String formattedTime = timeFormatter.format(date);
        System.out.println(formattedTime);
    }
}
