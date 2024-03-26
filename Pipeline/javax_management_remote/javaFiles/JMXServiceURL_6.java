import javax.management.remote.JMXServiceURL;

public class JMXServiceURL_6 {
    public static void main(String[] args) {
        try {
            JMXServiceURL url1 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            JMXServiceURL url2 = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");

            System.out.println(url1.equals(url2)); // Output: true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
