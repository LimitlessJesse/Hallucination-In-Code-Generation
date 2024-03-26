import java.beans.FeatureDescriptor;
import java.util.ArrayList;

public class FeatureDescriptor_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        FeatureDescriptor fd = new FeatureDescriptor(null, null);
        boolean isPreferred = fd.isPreferred();
        System.out.println("Is the feature preferred? " + isPreferred);
    }
}
