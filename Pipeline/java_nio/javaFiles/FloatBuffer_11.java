import java.nio.FloatBuffer;

public class FloatBuffer_11 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);
        buffer.put(1.0f);
        buffer.flip();
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
