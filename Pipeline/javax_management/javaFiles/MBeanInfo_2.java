import javax.management.*;

public class MBeanInfo_2 {
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("javax.management:type=Memory");
        MBeanInfo info = mbs.getMBeanInfo(name);
        String className = info.getClassName();
        System.out.println("Class Name: " + className);
    }
}
