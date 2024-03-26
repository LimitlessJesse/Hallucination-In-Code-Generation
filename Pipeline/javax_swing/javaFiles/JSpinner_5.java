import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_5 {
    public static void main(String[] args) {
        // Create a spinner model with an initial value of 50
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(50, 0, 100, 1);

        // Create a JSpinner and set the model
        JSpinner spinner = new JSpinner(spinnerModel);

        // Set a new value
        spinner.setValue(75);

        // Print the new value
        System.out.println("New value: " + spinnerModel.getNumber());
    }
}
