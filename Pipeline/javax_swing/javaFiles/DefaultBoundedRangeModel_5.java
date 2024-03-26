import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_5 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(0, 0, 0, 100);
        int value = model.getValue();
        System.out.println("Current value: " + value);
    }
}
