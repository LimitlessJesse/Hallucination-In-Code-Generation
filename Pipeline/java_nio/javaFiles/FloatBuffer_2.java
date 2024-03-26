import java.nio.FloatBuffer;

public class FloatBuffer_2 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);

        // Fill the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((float) i);
        }

        // Print the buffer
        System.out.println("Before compact:");
        printBuffer(buffer);

        // Compact the buffer
        buffer.compact();

        // Print the buffer after compact
        System.out.println("After compact:");
        printBuffer(buffer);
    }

    private static void printBuffer(FloatBuffer buffer) {
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
    }
}
