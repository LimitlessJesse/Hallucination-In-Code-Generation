import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.Selector;
import java.nio.ByteBuffer;
import java.net.InetSocketAddress;
import java.io.IOException;

public class SelectionKey_5 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8080));
        serverSocketChannel.configureBlocking(false);

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            for (SelectionKey key : selector.selectedKeys()) {
                if (key.isAcceptable()) {
                    SocketChannel client = serverSocketChannel.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int read = client.read(buffer);
                    if (read!= -1) {
                        System.out.println("Received: " + new String(buffer.array(), 0, read));
                    } else {
                        client.close();
                    }
                }
            }
            selector.selectedKeys().clear();
        }
    }
}
