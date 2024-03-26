import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_3 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        Checksum checksum = new Checksum() {
            private long sum;

            @Override
            public void update(int b) {
                sum += b;
            }

            @Override
            public long getValue() {
                return sum;
            }

            @Override
            public void reset() {
                sum = 0;
            }
        };

        CheckedInputStream checkedInputStream = new CheckedInputStream(byteArrayInputStream, checksum);

        byte[] buffer = new byte[data.length];
        try {
            int read = checkedInputStream.read(buffer, 0, buffer.length);
            System.out.println("Read " + read + " bytes");
            System.out.println("Checksum: " + checksum.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
