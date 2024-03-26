import javax.management.*;
import java.lang.management.*;

public class MBeanInfo_7 {
    public static void main(String[] args) {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = null;
        try {
            name = new ObjectName("javax.management:type=Memory");
            MBeanInfo mbeanInfo = mbs.getMBeanInfo(name);
            MBeanOperationInfo[] operations = mbeanInfo.getOperations();
            for (MBeanOperationInfo operation : operations) {
                System.out.println("Operation: " + operation.getName());
                System.out.println("Description: " + operation.getDescription());
                System.out.println("Signature: " + operation.getSignature());
                System.out.println("Return type: " + operation.getReturnType());
                System.out.println("Exception types: " + operation.getExceptionTypes());
                System.out.println("----------------------------");
            }
        } catch (MalformedObjectNameException | NullPointerException | InstanceNotFoundException | IntrospectionException | ReflectionException | MBeanException e) {
            e.printStackTrace();
        }
    }
}
