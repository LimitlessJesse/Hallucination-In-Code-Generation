import java.util.Calendar;

public class Calendar_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println("Current time in milliseconds: " + timeInMillis);
    }
}
