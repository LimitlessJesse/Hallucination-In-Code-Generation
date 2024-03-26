import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_3 {
    public static void main(String[] args) {
        MBeanFeatureInfo featureInfo = new MBeanFeatureInfo();
        featureInfo.setName("myFeature");
        System.out.println(featureInfo.getName());
    }
}
