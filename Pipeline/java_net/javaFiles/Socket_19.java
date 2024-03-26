import java.net.Socket;
import java.io.IOException;

public class Socket_19 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setOOBInline(true);
            // Further code to send and receive data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
