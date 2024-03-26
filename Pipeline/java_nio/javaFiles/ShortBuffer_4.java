import java.nio.ShortBuffer;

public class ShortBuffer_4 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        buffer.put(0, (short) 10);
        buffer.flip();
        System.out.println(buffer.get(0));
    }
}
