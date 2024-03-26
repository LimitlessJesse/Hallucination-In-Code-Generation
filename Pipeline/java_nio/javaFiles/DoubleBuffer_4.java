import java.nio.*;

public class DoubleBuffer_4 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(10);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (double) i);
        }
        buffer.flip();

        DoubleBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();

        // Print the elements of the read-only buffer
        while (readOnlyBuffer.hasRemaining()) {
            System.out.println(readOnlyBuffer.get());
        }
    }
}
