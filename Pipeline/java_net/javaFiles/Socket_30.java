import java.net.Socket;
import java.io.IOException;

public class Socket_30 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            int trafficClass = socket.getTrafficClass();
            System.out.println("Traffic class: " + trafficClass);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
