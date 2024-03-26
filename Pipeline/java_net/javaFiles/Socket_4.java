import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socket_4 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream outputStream = socket.getOutputStream();
            String message = "Hello, server!";
            outputStream.write(message.getBytes());
            outputStream.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
