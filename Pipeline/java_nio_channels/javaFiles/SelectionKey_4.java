import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.io.IOException;

public class SelectionKey_4 {
    public static void main(String[] args) throws IOException {
        // Create a ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        // Create a SocketChannel
        SocketChannel socketChannel = SocketChannel.open();

        // Create an AsynchronousServerSocketChannel
        AsynchronousServerSocketChannel asyncServerSocketChannel = AsynchronousServerSocketChannel.open();

        // Create an AsynchronousSocketChannel
        AsynchronousSocketChannel asyncSocketChannel = AsynchronousSocketChannel.open();

        // Get SelectionKey for the ServerSocketChannel
        SelectionKey serverKey = serverSocketChannel.register(null, SelectionKey.OP_ACCEPT);

        // Get SelectionKey for the SocketChannel
        SelectionKey socketKey = socketChannel.register(null, SelectionKey.OP_CONNECT);

        // Get SelectionKey for the AsynchronousServerSocketChannel
        SelectionKey asyncServerKey = asyncServerSocketChannel.register(null, SelectionKey.OP_ACCEPT);

        // Get SelectionKey for the AsynchronousSocketChannel
        SelectionKey asyncSocketKey = asyncSocketChannel.register(null, SelectionKey.OP_CONNECT);

        // Check if the channel is in the connectable state
        System.out.println("ServerSocketChannel is connectable: " + serverKey.isConnectable());
        System.out.println("SocketChannel is connectable: " + socketKey.isConnectable());
        System.out.println("AsynchronousServerSocketChannel is connectable: " + asyncServerKey.isConnectable());
        System.out.println("AsynchronousSocketChannel is connectable: " + asyncSocketKey.isConnectable());
    }
}
