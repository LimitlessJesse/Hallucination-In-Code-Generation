import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_2 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
        spinner.setModel(model);
    }
}
