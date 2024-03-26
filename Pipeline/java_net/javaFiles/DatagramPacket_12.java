import java.net.DatagramPacket;
import java.net.InetAddress;

public class DatagramPacket_12 {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        packet.setPort(4446);
        System.out.println("New port number: " + packet.getPort());
    }
}
