import java.net.Socket;
import java.io.IOException;

public class Socket_11 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            socket.setSoTimeout(5000); // Set the timeout value to 5000 milliseconds
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
