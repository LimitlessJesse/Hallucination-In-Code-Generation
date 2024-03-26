import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_8 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int receiveBufferSize = serverSocket.getReceiveBufferSize();
            System.out.println("Receive Buffer Size: " + receiveBufferSize);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
