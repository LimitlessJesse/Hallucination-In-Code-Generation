import java.net.Socket;
import java.io.IOException;

public class Socket_46 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            int sendBufferSize = socket.getSendBufferSize();
            System.out.println("Send buffer size: " + sendBufferSize);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
