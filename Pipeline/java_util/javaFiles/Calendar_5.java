import java.util.Calendar;

public class Calendar_5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1609459200000L); // 2020-12-31 00:00:00
        System.out.println(calendar.getTime());
    }
}
