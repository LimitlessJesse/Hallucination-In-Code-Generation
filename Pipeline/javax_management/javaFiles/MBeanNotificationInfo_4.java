import javax.management.MBeanNotificationInfo;

public class MBeanNotificationInfo_4 {
    public static void main(String[] args) {
        MBeanNotificationInfo info1 = new MBeanNotificationInfo(new String[]{"type1", "type2"}, "description1", "mbean1");
        MBeanNotificationInfo info2 = new MBeanNotificationInfo(new String[]{"type1", "type2"}, "description1", "mbean1");
        MBeanNotificationInfo info3 = new MBeanNotificationInfo(new String[]{"type3", "type4"}, "description3", "mbean3");

        System.out.println(info1.equals(info2));  // true
        System.out.println(info1.equals(info3));  // false
    }
}
