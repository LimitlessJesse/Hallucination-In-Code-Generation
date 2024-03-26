import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_3 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        channel.bind(new InetSocketAddress(9999));

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 9999);

        int bytesRead = channel.read(buffer);
        if (bytesRead!= -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
        }

        channel.close();
    }
}
