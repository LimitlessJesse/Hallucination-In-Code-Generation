import java.net.Socket;
import java.io.IOException;

public class Socket_36 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            int timeout = socket.getSoTimeout();
            System.out.println("Timeout value: " + timeout);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
