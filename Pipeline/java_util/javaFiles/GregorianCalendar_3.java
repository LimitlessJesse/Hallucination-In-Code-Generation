import java.util.GregorianCalendar;

public class GregorianCalendar_3 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int day = calendar.getActualMinimum(GregorianCalendar.DAY_OF_MONTH);
        int month = calendar.getActualMinimum(GregorianCalendar.MONTH);
        int year = calendar.getActualMinimum(GregorianCalendar.YEAR);

        System.out.println("Minimum day: " + day);
        System.out.println("Minimum month: " + month);
        System.out.println("Minimum year: " + year);
    }
}
