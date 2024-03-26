import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class JSpinner_1 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SpinnerModel model = spinner.getModel();
        System.out.println(model);
    }
}
