import javax.swing.DefaultBoundedRangeModel;

public class DefaultBoundedRangeModel_2 {
    public static void main(String[] args) {
        DefaultBoundedRangeModel model = new DefaultBoundedRangeModel(0, 0, 0, 100);
        int extent = model.getExtent();
        System.out.println("Extent: " + extent);
    }
}
