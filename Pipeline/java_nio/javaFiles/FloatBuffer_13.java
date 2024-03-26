import java.nio.FloatBuffer;
import java.nio.ByteBuffer;

public class FloatBuffer_13 {
    public static void main(String[] args) {
        // Create a new FloatBuffer with capacity 5
        FloatBuffer buffer = FloatBuffer.allocate(5);

        // Put some data into the buffer
        buffer.put(new float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f});

        // Flip the buffer to prepare it for reading
        buffer.flip();

        // Create a slice of the buffer
        FloatBuffer slice = buffer.slice();

        // Print the content of the slice
        while(slice.hasRemaining()) {
            System.out.println(slice.get());
        }

        // Change the content of the slice
        slice.put(0, 10.0f);

        // Print the content of the buffer after changing the slice
        buffer.rewind();
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
