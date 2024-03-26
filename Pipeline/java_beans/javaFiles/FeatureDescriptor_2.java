import java.beans.FeatureDescriptor;
import java.util.ArrayList;

public class FeatureDescriptor_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        FeatureDescriptor fd = new FeatureDescriptor(null, null);
        boolean isHidden = fd.isHidden();
        System.out.println("Is feature hidden? " + isHidden);
    }
}
