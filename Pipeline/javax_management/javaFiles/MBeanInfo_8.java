import javax.management.*;

public class MBeanInfo_8 {
    public static void main(String[] args) {
        try {
            // Create a new MBean server
            MBeanServer mbs = MBeanServerFactory.createMBeanServer();

            // Create a new MBean
            ObjectName name = new ObjectName("com.example:type=MyMBean");
            MyMBean mb = new MyMBean();
            mbs.registerMBean(mb, name);

            // Get the MBean info
            MBeanInfo info = mbs.getMBeanInfo(name);

            // Get the notifications
            MBeanNotificationInfo[] notifications = info.getNotifications();

            // Print the notifications
            for (MBeanNotificationInfo notification : notifications) {
                System.out.println("Notification Type: " + notification.getType());
                System.out.println("Notification Class: " + notification.getClassName());
                System.out.println("Notification Description: " + notification.getDescription());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
