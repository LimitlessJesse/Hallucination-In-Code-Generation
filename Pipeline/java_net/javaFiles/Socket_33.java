import java.net.Socket;
import java.io.IOException;

public class Socket_33 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSoLinger(true, 5000);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
