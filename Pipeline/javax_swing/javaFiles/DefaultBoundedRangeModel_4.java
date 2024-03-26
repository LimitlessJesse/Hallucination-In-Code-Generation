import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_4 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(0, 0, 0, 100);
        int min = model.getMinimum();
        System.out.println("Minimum value: " + min);
    }
}
