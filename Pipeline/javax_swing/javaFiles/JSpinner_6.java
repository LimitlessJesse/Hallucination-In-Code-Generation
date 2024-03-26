import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_6 {
    public static void main(String[] args) {
        SpinnerNumberModel model = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(model);

        // Get the value
        Number value = (Number) spinner.getValue();
        System.out.println("Value: " + value);
    }
}
