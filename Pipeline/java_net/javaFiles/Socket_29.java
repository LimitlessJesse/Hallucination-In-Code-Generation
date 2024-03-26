import java.net.DatagramSocket;
import java.net.SocketException;

public class Socket_29 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setTrafficClass(0x04); // 0x04 is the value for the best effort service
            System.out.println("Traffic class set successfully!");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
