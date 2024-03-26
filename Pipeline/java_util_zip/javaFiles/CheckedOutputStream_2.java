import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;

public class CheckedOutputStream_2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
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

            CheckedOutputStream cos = new CheckedOutputStream(fos, checksum);
            cos.write(65); // 'A'
            System.out.println("Checksum: " + cos.getChecksum().getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
