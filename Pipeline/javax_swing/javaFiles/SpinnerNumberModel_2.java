import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModel_2 {
    public static void main(String[] args) {
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(0, 0, 100, 1);
        spinnerNumberModel.setValue(50);
        System.out.println(spinnerNumberModel.getNumber());
    }
}
