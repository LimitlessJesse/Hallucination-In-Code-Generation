import java.net.Socket;
import java.io.IOException;

public class Socket_48 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            int bufferSize = socket.getReceiveBufferSize();
            System.out.println("Receive buffer size: " + bufferSize);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
