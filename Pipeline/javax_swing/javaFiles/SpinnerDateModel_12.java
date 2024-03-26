import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_12 {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Create a SpinnerDateModel instance
        SpinnerDateModel spinnerDateModel = new SpinnerDateModel();

        // Set the value of the SpinnerDateModel
        spinnerDateModel.setValue(calendar.getTime());

        // Get the value of the SpinnerDateModel
        Date date = (Date) spinnerDateModel.getValue();

        // Print the date
        System.out.println(date);
    }
}
