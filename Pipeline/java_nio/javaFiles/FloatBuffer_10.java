import java.nio.FloatBuffer;

public class FloatBuffer_10 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);
        buffer.put(0, 1.0f);
        buffer.put(1, 2.0f);
        buffer.put(2, 3.0f);
        buffer.put(3, 4.0f);
        buffer.put(4, 5.0f);
        buffer.put(5, 6.0f);
        buffer.put(6, 7.0f);
        buffer.put(7, 8.0f);
        buffer.put(8, 9.0f);
        buffer.put(9, 10.0f);

        buffer.flip();

        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
