import java.nio.FloatBuffer;

public class FloatBuffer_19 {
    public static void main(String[] args) {
        FloatBuffer buffer1 = FloatBuffer.allocate(5);
        buffer1.put(new float[] {1.0f, 2.0f, 3.0f, 4.0f, 5.0f});

        FloatBuffer buffer2 = FloatBuffer.allocate(5);
        buffer2.put(new float[] {6.0f, 7.0f, 8.0f, 9.0f, 10.0f});

        buffer1.put(buffer2);

        buffer1.flip();

        while(buffer1.hasRemaining()) {
            System.out.println(buffer1.get());
        }
    }
}
