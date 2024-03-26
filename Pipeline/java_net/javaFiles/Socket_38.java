import java.net.Socket;
import java.io.IOException;

public class Socket_38 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            boolean tcpNoDelay = socket.getTcpNoDelay();
            System.out.println("TCP_NODELAY is " + (tcpNoDelay? "enabled" : "disabled"));
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
