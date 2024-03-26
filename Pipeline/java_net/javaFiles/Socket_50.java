import java.net.Socket;
import java.io.IOException;

public class Socket_50 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
