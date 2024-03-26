import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MulticastSocket_4 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            MulticastSocket socket = new MulticastSocket();
            socket.joinGroup(group);
            // do something...
            socket.leaveGroup(group);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
