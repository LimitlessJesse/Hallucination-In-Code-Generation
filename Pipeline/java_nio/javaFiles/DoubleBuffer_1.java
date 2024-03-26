import java.nio.DoubleBuffer;

public class DoubleBuffer_1 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(10);
        buffer.put(1.0);
        buffer.flip();
        System.out.println(buffer.get());
    }
}
