import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_12 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            serverSocket.setReceiveBufferSize(1024);
            System.out.println("Receive buffer size set to: " + serverSocket.getReceiveBufferSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
