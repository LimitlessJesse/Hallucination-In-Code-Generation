import java.nio.IntBuffer;

public class IntBuffer_2 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip();

        IntBuffer duplicateBuffer = buffer.duplicate();

        while (duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
