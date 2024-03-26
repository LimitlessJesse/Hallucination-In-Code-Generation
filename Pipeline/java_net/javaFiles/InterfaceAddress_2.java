import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InterfaceAddress_2 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                if (networkInterface.isLoopback() ||!networkInterface.isUp()) {
                    continue;
                }
                for (InetAddress address : Collections.list(networkInterface.getInetAddresses())) {
                    if (!address.isLoopbackAddress()) {
                        System.out.println("Broadcast Address: " + networkInterface.getInterfaceAddresses().get(0).getBroadcast());
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
