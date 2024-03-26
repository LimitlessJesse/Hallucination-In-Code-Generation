import java.nio.CharBuffer;

public class CharBuffer_2 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.put(0, 'H');
        buffer.put(1, 'e');
        buffer.put(2, 'l');
        buffer.put(3, 'l');
        buffer.put(4, 'o');
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }
    }
}
