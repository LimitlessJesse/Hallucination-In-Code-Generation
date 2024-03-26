import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class DatagramChannel_5 {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();
        channel.bind(new InetSocketAddress(9999));

        ByteBuffer[] buffers = new ByteBuffer[2];
        buffers[0] = ByteBuffer.allocate(48);
        buffers[1] = ByteBuffer.allocate(48);

        channel.receive(buffers);

        for (ByteBuffer buffer : buffers) {
            System.out.println("Position: " + buffer.position() + ", Limit: " + buffer.limit());
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
            buffer.clear();
        }

        channel.close();
    }
}
