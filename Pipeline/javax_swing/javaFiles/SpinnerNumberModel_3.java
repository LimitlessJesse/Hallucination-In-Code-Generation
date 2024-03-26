import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_3 {
    public static void main(String[] args) {
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(5, 0, 10, 1);
        System.out.println("Current Value: " + spinnerModel.getValue());
    }
}
