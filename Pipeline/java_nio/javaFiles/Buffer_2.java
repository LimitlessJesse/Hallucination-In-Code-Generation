import java.nio.ByteBuffer;

public class Buffer_2 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Writing data into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Printing the buffer before flip()
        System.out.println("Before flip(): " + buffer);

        // Flipping the buffer
        buffer.flip();

        // Printing the buffer after flip()
        System.out.println("After flip(): " + buffer);
    }
}
