import java.nio.ShortBuffer;

public class ShortBuffer_2 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);

        for (short i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip();

        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.println(buffer.get(i));
        }
    }
}
