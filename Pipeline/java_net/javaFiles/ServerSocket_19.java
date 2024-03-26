import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_19 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setReuseAddress(true);
            System.out.println("ServerSocket is set to reuse address");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
