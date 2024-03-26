import javax.management.*;

public class ObjectInstance_3 {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, MBeanRegistrationException, InstanceAlreadyExistsException, MBeanException, ReflectionException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.example:type=Test");
        Test test = new Test();
        mbs.registerMBean(test, name);

        ObjectInstance oi = mbs.getObjectInstance(name);
        ObjectName on = oi.getObjectName();

        System.out.println(on);
    }
}

class Test implements TestMBean {
    // Implement the MBean interface
}

interface TestMBean {
    // Define the MBean operations and attributes
}
