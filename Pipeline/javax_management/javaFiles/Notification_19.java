import javax.management.*;

public class Notification_19 {
    public static void main(String[] args) throws NotCompliantMBeanException, MBeanException, ReflectionException, InstanceNotFoundException, IntrospectionException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.example:type=Test");
        TestMBean mbean = new TestMBean();
        mbs.registerMBean(mbean, name);

        MBeanNotificationInfo[] notificationInfos = mbean.getNotificationInfo();
        for (MBeanNotificationInfo info : notificationInfos) {
            System.out.println("Type: " + info.getType());
            System.out.println("Sequence Number: " + info.getSequenceNumber());
            info.setSequenceNumber(100);
            System.out.println("New Sequence Number: " + info.getSequenceNumber());
        }
    }
}

class TestMBean implements NotificationBroadcasterMBean {
    // Implement the methods of NotificationBroadcasterMBean
    //...

    @Override
    public MBeanNotificationInfo[] getNotificationInfo() {
        // Implement the method
        //...
        return null;
    }
}
