import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_7 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        channel.bind(new InetSocketAddress(4321));

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.receive(buffer);

        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        buffer.clear();

        channel.close();
    }
}
