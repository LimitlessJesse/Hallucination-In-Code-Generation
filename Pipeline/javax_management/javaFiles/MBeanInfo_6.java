import javax.management.*;

public class MBeanInfo_6 {
    public static void main(String[] args) {
        try {
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("javax.management:type=Memory");
            MBeanInfo info = mbs.getMBeanInfo(name);
            MBeanConstructorInfo[] constructors = info.getConstructors();

            for (MBeanConstructorInfo constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Description: " + constructor.getDescription());
                System.out.println("Signature: " + constructor.getSignature());
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
