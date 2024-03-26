import java.nio.LongBuffer;

public class LongBuffer_4 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        buffer.put(0, 1234567890L);
        buffer.flip();
        System.out.println(buffer.get(0));
    }
}
