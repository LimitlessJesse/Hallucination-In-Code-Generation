import java.util.GregorianCalendar;

public class GregorianCalendar_1 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int year = 2020;
        boolean isLeapYear = gc.isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
