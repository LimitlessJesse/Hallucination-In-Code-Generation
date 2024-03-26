import java.nio.ByteBuffer;

public class Buffer_1 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Initial capacity: " + buffer.capacity());

        buffer.put((byte) 1);
        System.out.println("Capacity after put: " + buffer.capacity());

        buffer.flip();
        System.out.println("Capacity after flip: " + buffer.capacity());
    }
}
