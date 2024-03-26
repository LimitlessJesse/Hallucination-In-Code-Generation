import java.net.Socket;
import java.io.IOException;

public class Socket_5 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            // Perform operations on the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
