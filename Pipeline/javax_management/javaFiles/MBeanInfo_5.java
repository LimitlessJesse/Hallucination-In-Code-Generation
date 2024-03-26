import javax.management.*;

public class MBeanInfo_5 {
    public static void main(String[] args) {
        try {
            // Create a MBean server
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

            // Get the MBean info
            ObjectName name = new ObjectName("com.example:type=MyBean");
            MBeanInfo info = mbs.getMBeanInfo(name);

            // Get the attributes
            MBeanAttributeInfo[] attributes = info.getAttributes();

            // Print the attributes
            for (MBeanAttributeInfo attribute : attributes) {
                System.out.println("Attribute: " + attribute.getName());
                System.out.println("Description: " + attribute.getDescription());
                System.out.println("Type: " + attribute.getType());
                System.out.println("Is readable: " + attribute.isReadable());
                System.out.println("Is writable: " + attribute.isWritable());
                System.out.println("Is is: " + attribute.isIs());
                System.out.println("Is is: " + attribute.isIs());
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
