import java.awt.color.ICC_Profile;
import java.awt.color.ColorSpace;
import java.io.FileInputStream;
import java.io.IOException;

public class ColorSpace_2 {
    public static void main(String[] args) {
        try {
            ICC_Profile profile = ICC_Profile.getInstance(new FileInputStream("path_to_your_icc_profile.icc"));
            float[] colorValue = {0.1f, 0.2f, 0.3f}; // replace with your color value
            float[] ciexyz = profile.fromCIEXYZ(colorValue);
            System.out.println("CIEXYZ: " + ciexyz[0] + ", " + ciexyz[1] + ", " + ciexyz[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
