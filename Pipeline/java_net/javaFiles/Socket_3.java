import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Socket_3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.example.com", 80);
            InputStream inputStream = socket.getInputStream();

            // Read data from the input stream
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print((char) data);
            }

            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
