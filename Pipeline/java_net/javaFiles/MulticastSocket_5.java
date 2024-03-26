import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSocket_5 {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket();
        socket.setTimeToLive(1);

        String message = "Hello, Multicast!";
        InetAddress group = InetAddress.getByName("224.0.0.1");
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), group, 4446);

        socket.send(packet);
        socket.close();
    }
}
