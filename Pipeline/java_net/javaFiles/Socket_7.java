import java.net.Socket;
import java.net.InetSocketAddress;

public class Socket_7 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 8080), 5000);
            System.out.println("Connected to the server");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
