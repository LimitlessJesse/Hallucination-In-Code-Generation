import javax.management.*;

public class MBeanInfo_3 {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("javax.management:type=Memory");
        MBeanInfo info = mbs.getMBeanInfo(name);
        String description = info.getDescription();
        System.out.println(description);
    }
}
