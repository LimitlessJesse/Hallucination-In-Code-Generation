import java.net.Socket;

public class Socket_16 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        boolean reuseAddress = socket.getReuseAddress();
        System.out.println("Reuse Address: " + reuseAddress);
    }
}
