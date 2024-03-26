import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_18 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int timeout = serverSocket.getSoTimeout();
            System.out.println("SoTimeout: " + timeout);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
