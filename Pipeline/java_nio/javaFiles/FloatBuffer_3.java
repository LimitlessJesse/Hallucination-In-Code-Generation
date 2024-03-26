import java.nio.*;

public class FloatBuffer_3 {
    public static void main(String[] args) {
        FloatBuffer originalBuffer = FloatBuffer.allocate(5);
        originalBuffer.put(new float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f});
        originalBuffer.flip();

        FloatBuffer duplicateBuffer = originalBuffer.duplicate();

        System.out.println("Original Buffer:");
        while(originalBuffer.hasRemaining()){
            System.out.println(originalBuffer.get());
        }

        System.out.println("\nDuplicate Buffer:");
        while(duplicateBuffer.hasRemaining()){
            System.out.println(duplicateBuffer.get());
        }
    }
}
