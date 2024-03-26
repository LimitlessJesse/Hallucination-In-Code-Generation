import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.Selector;
import java.nio.ByteBuffer;
import java.net.InetSocketAddress;
import java.io.IOException;

public class SelectionKey_6 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
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
                        buffer.flip();
                        System.out.println(new String(buffer.array(), 0, read));
                        client.register(selector, SelectionKey.OP_WRITE);
                    }
                } else if (key.isWritable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
                    client.write(buffer);
                    client.register(selector, SelectionKey.OP_READ);
                }
                key.cancel();
            }
        }
    }
}
