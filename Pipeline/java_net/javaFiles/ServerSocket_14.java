import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class ServerSocket_14 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 8080));
            System.out.println("Server is listening on port 8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
