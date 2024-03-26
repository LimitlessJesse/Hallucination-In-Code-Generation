import java.nio.LongBuffer;

public class LongBuffer_1 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((long) i);
        }

        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
