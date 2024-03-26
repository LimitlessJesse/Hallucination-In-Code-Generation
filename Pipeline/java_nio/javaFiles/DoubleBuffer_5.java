import java.nio.*;

public class DoubleBuffer_5 {
    public static void main(String[] args) {
        DoubleBuffer originalBuffer = DoubleBuffer.allocate(10);
        for (int i = 0; i < originalBuffer.capacity(); i++) {
            originalBuffer.put(i * 1.0);
        }
        originalBuffer.flip();

        DoubleBuffer duplicateBuffer = originalBuffer.duplicate();

        while (duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
