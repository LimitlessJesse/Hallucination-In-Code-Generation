import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_20 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            boolean reuseAddress = serverSocket.getReuseAddress();
            System.out.println("Reuse Address: " + reuseAddress);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
