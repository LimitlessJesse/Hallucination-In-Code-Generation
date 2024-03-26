import java.net.Socket;
import java.io.IOException;

public class Socket_23 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setSendBufferSize(1024);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
