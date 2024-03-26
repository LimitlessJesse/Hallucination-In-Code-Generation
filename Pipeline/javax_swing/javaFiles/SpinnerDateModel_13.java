import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;

public class SpinnerDateModel_13 {
    public static void main(String[] args) {
        // Create a spinner with a date model
        JSpinner spinner = new JSpinner(new SpinnerDateModel());

        // Get the current value of the spinner
        Date currentDate = (Date) spinner.getValue();

        // Print the current date
        System.out.println("Current date: " + currentDate);
    }
}
