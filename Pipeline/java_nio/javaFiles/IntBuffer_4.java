import java.nio.IntBuffer;

public class IntBuffer_4 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            int j = 2 * (i + 1);
            buffer.put(j);
        }

        buffer.flip();

        int index = 3;
        int value = buffer.get(index);

        System.out.println("The value at index " + index + " is " + value);
    }
}
