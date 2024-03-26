import java.nio.ShortBuffer;

public class ShortBuffer_3 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        buffer.put((short) 10);
        buffer.flip();
        System.out.println(buffer.get());
    }
}
