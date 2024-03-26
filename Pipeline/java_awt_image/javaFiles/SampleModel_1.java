import java.awt.image.SampleModel;
import java.awt.image.DataBuffer;

public class SampleModel_1 {
    public static void main(String[] args) {
        SampleModel sampleModel = new DataBuffer(10, 10, 10, 10);
        int band = 0;
        int sampleSize = sampleModel.getSampleSize(band);
        System.out.println("Sample size for band " + band + " is: " + sampleSize);
    }
}
