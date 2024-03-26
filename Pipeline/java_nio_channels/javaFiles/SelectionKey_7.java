import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectionKey_7 {
    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);

        // Cancel the selection key
        key.cancel();

        // Check if the key is still valid
        if (key.isValid()) {
            System.out.println("Key is still valid");
        } else {
            System.out.println("Key is no longer valid");
        }

        // Select and process ready keys
        selector.select();
        Set<SelectionKey> selectedKeys = selector.selectedKeys();
        Iterator<SelectionKey> iterator = selectedKeys.iterator();
        while (iterator.hasNext()) {
            SelectionKey selectedKey = iterator.next();
            if (selectedKey.isAcceptable()) {
                // Accept the connection
            } else if (selectedKey.isReadable()) {
                // Read data
            }
            iterator.remove();
        }
    }
}
