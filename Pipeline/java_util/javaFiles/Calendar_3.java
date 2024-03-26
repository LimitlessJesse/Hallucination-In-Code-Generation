import java.util.Calendar;

public class Calendar_3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Before adding: " + calendar.getTime());

        // Add 5 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println("After adding: " + calendar.getTime());
    }
}
