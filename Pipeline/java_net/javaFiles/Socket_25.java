import java.net.Socket;
import java.io.IOException;

public class Socket_25 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setReceiveBufferSize(1024);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
