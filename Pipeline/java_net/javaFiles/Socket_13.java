import java.net.Socket;
import java.io.IOException;

public class Socket_13 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            socket.setTcpNoDelay(true);
            // do something with the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
