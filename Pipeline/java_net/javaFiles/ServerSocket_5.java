import java.net.ServerSocket;
import java.io.IOException;

public class ServerSocket_5 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            // Your server code here
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket!= null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
