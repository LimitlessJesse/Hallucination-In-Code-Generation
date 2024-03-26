import java.net.Socket;
import java.io.IOException;

public class Socket_17 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setKeepAlive(true);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
