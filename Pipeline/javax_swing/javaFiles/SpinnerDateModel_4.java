import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class SpinnerDateModel_4 {
    public static void main(String[] args) {
        // Create a JSpinner with a SpinnerDateModel
        JSpinner spinner = new JSpinner(new SpinnerDateModel());

        // Set the calendar field to DAY_OF_MONTH
        ((SpinnerDateModel) spinner.getModel()).setCalendarField(Calendar.DAY_OF_MONTH);

        // Print the current date
        System.out.println(spinner.getValue());
    }
}
