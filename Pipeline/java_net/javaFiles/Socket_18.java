import java.net.Socket;
import java.io.IOException;

public class Socket_18 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            System.out.println("Keep Alive: " + socket.getKeepAlive());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
