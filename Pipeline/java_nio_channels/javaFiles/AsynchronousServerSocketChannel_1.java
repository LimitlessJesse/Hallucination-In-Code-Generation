import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;

public class AsynchronousServerSocketChannel_1 {
    public static void main(String[] args) throws IOException {
        AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(8080));
    }
}
