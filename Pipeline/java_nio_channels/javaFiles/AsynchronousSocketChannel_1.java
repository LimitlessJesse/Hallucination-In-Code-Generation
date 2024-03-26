import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;

public class AsynchronousSocketChannel_1 {
    public static void main(String[] args) throws IOException {
        AsynchronousSocketChannel socketChannel = AsynchronousSocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8080));
    }
}
