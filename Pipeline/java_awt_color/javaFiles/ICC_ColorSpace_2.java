import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.color.ICC_ProfileGray;
import java.awt.color.ICC_ProfileRGB;
import java.awt.color.ICC_ProfileXYZ;
import java.awt.color.ICC_ProfileXYZ_float;

public class ICC_ColorSpace_2 {
    public static void main(String[] args) {
        try {
            ICC_Profile profile = ICC_Profile.getInstance(Main.class.getResourceAsStream("/icc/sRGB.icc"));
            ICC_ProfileRGB rgbProfile = new ICC_ProfileRGB(profile);
            ICC_ProfileGray grayProfile = new ICC_ProfileGray(profile);
            ICC_ProfileXYZ xyzProfile = new ICC_ProfileXYZ(profile);
            ICC_ProfileXYZ_float xyzProfileFloat = new ICC_ProfileXYZ_float(profile);

            float[] xyzval = {0.1f, 0.2f, 0.3f};
            float[] result = xyzProfileFloat.fromXYZ(xyzval);

            System.out.println("Result: " + result[0] + ", " + result[1] + ", " + result[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
