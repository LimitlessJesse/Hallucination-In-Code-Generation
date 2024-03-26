import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_5 {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1234);
        System.out.println("Length of the data in the datagram packet: " + packet.getLength());
    }
}
