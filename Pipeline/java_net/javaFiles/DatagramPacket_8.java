import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_8 {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
        System.out.println("Port number: " + packet.getPort());
    }
}
