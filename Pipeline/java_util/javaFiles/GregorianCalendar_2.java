import java.util.GregorianCalendar;

public class GregorianCalendar_2 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int maxDay = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        int maxMonth = calendar.getActualMaximum(GregorianCalendar.MONTH);
        int maxYear = calendar.getActualMaximum(GregorianCalendar.YEAR);

        System.out.println("Maximum day of the month: " + maxDay);
        System.out.println("Maximum month of the year: " + maxMonth);
        System.out.println("Maximum year: " + maxYear);
    }
}
