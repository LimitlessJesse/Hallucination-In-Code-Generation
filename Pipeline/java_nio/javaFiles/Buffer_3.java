import java.nio.ByteBuffer;

public class Buffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Populate the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Print the buffer
        System.out.println("Buffer before clear: " + buffer);

        // Clear the buffer
        buffer.clear();

        // Print the buffer again
        System.out.println("Buffer after clear: " + buffer);
    }
}
