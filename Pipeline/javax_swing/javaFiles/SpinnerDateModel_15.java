import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_15 {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 1);

        // Create a SpinnerDateModel instance
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel(calendar.getTime(), null, null, Calendar.DAY_OF_MONTH);

        // Get the next value
        Date nextValue = (Date) spinnerDateModel.getNextValue();

        // Print the next value
        System.out.println("Next value: " + nextValue);
    }
}
