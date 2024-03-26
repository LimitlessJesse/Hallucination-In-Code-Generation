import java.nio.ByteBuffer;

public class Buffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write data into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Print the buffer
        System.out.println("Buffer before rewind: " + buffer);

        // Rewind the buffer
        buffer.rewind();

        // Print the buffer after rewind
        System.out.println("Buffer after rewind: " + buffer);
    }
}
