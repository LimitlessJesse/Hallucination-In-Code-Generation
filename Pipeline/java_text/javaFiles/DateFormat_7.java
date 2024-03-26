import java.text.DateFormat;
import java.util.Date;

public class DateFormat_7 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat timeInstance = DateFormat.getTimeInstance();
        String formattedTime = timeInstance.format(date);
        System.out.println(formattedTime);
    }
}
