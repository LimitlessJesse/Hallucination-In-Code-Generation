import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_17 {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 1);

        // Create a SpinnerDateModel instance
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel(calendar.getTime(), null, null, Calendar.DAY_OF_MONTH);

        // Get the previous value
        Date previousValue = spinnerDateModel.getPreviousValue();

        // Print the previous value
        System.out.println("Previous Value: " + previousValue);
    }
}
