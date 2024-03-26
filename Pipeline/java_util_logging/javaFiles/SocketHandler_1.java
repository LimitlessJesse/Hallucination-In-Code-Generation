import java.io.IOException;
import java.util.logging.SocketHandler;

public class SocketHandler_1 {
    public static void main(String[] args) {
        SocketHandler socketHandler = new SocketHandler();
        try {
            socketHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
