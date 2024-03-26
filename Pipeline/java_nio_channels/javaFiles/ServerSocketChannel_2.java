import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

public class ServerSocketChannel_2 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress("localhost", 8080));
            System.out.println("Server is listening on port 8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
