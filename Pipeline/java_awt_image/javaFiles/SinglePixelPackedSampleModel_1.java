import java.awt.image.SinglePixelPackedSampleModel;

public class SinglePixelPackedSampleModel_1 {
    public static void main(String[] args) {
        SinglePixelPackedSampleModel model = new SinglePixelPackedSampleModel(16, 1, 1, 1);
        int sampleSize = model.getSampleSize(0);
        System.out.println("Sample size: " + sampleSize);
    }
}
