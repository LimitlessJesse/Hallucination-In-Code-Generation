import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_3 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String hostName = inetAddress.getHostName();
            System.out.println("Host Name: " + hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
