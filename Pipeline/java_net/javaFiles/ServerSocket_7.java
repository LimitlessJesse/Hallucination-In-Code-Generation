import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_7 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(0);
            int port = serverSocket.getLocalPort();
            System.out.println("Local port: " + port);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
