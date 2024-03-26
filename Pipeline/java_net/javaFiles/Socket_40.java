import java.net.Socket;

public class Socket_40 {
    public static void main(String[] args) {
        Socket socket = new Socket();
        boolean reuseAddress = socket.getReuseAddress();
        System.out.println("Reuse Address: " + reuseAddress);
    }
}
