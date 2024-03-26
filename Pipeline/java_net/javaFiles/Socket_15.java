import java.net.Socket;
import java.io.IOException;

public class Socket_15 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.setReuseAddress(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
