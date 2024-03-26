import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_3 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(0, 0, 0, 100);
        int max = model.getMaximum();
        System.out.println("Maximum value: " + max);
    }
}
