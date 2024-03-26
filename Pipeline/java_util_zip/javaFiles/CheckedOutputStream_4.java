import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CheckedOutputStream;
import java.util.zip.CRC32;

public class CheckedOutputStream_4 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CheckedOutputStream checkedOutputStream = new CheckedOutputStream(byteArrayOutputStream, new CRC32());

            String data = "Hello, World!";
            byte[] byteArray = data.getBytes();

            checkedOutputStream.write(byteArray, 0, byteArray.length);

            System.out.println("Data written: " + byteArrayOutputStream.toString());
            System.out.println("CRC32 checksum: " + checkedOutputStream.getChecksum().getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
