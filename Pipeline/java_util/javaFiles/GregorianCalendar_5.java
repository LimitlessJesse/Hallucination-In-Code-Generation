import java.util.GregorianCalendar;
import java.util.Date;

public class GregorianCalendar_5 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        Date gregorianChange = gc.getGregorianChange();
        System.out.println("The Gregorian calendar reform date is: " + gregorianChange);
    }
}
