import java.net.ServerSocket;
import java.net.InetAddress;
import java.io.IOException;

public class ServerSocket_10 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            InetAddress inetAddress = serverSocket.getInetAddress();
            System.out.println("IP Address: " + inetAddress.getHostAddress());
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
