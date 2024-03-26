import java.nio.LongBuffer;

public class LongBuffer_3 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        buffer.put(1234567890L);
        buffer.flip();
        System.out.println(buffer.get());
    }
}
