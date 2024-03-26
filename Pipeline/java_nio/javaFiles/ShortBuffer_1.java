import java.nio.ShortBuffer;

public class ShortBuffer_1 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);

        for (short i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
