import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_17 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setSoTimeout(5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
