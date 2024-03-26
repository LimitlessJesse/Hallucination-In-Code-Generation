import java.net.SocketImpl;
import java.net.InetAddress;

public class SocketImpl_3 {
    public static void main(String[] args) {
        try {
            InetAddress localHost = SocketImpl.getInetAddress();
            System.out.println("Local Host IP Address: " + localHost.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
