import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_4 {
    public static void main(String[] args) {
        MBeanFeatureInfo featureInfo = new MBeanFeatureInfo();
        String description = featureInfo.getDescription();
        System.out.println(description);
    }
}
