import java.nio.*;

public class IntBuffer_3 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            int j = 2 * (i + 1);
            buffer.put(j);
        }

        buffer.flip();

        while(buffer.hasRemaining()) {
            int j = buffer.get();
            System.out.print(j + " ");
        }
    }
}
