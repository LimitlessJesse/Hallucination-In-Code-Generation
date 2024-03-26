import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;

public class Socket_9 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("IP Address: " + inetAddress.getHostAddress());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
