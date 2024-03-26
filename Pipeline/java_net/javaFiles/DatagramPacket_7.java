import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_7 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024, address, 80);
            InetAddress ipAddress = packet.getAddress();
            System.out.println("IP Address: " + ipAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
