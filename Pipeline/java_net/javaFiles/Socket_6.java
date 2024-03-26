import java.net.Socket;
import java.net.InetSocketAddress;

public class Socket_6 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            InetSocketAddress address = new InetSocketAddress("localhost", 8080);
            socket.connect(address);
            System.out.println("Connected to " + address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
