import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_1 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // ASCII values for 'A', 'B', 'C', 'D', 'E'
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        Checksum checksum = new Checksum() {
            private long value;

            @Override
            public void update(int b) {
                value += b;
            }

            @Override
            public long getValue() {
                return value;
            }

            @Override
            public void reset() {
                value = 0;
            }
        };
        CheckedInputStream checkedInputStream = new CheckedInputStream(byteArrayInputStream, checksum);

        try {
            int byteRead;
            while ((byteRead = checkedInputStream.read())!= -1) {
                System.out.println("Byte read: " + byteRead);
            }
            System.out.println("Checksum: " + checksum.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
