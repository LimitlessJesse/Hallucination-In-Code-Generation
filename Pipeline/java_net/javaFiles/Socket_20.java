import java.net.Socket;
import java.io.IOException;

public class Socket_20 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            boolean isOOBInline = socket.getOOBInline();
            System.out.println("Is OOB inline: " + isOOBInline);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
