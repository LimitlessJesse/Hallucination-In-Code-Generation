import java.net.Socket;
import java.io.IOException;

public class Socket_10 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            int port = socket.getPort();
            System.out.println("Port number: " + port);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
