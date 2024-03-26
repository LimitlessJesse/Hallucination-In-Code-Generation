import java.net.Socket;
import java.io.IOException;

public class Socket_51 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.shutdownOutput();
            // Now, socket will not be able to send data.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
