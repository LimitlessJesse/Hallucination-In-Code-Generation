import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendar_4 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        Date date = new Date(100, 0, 1); // January 1, 100
        gc.setGregorianChange(date);
    }
}
