import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_3 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {

            dos.write("Hello, World!".getBytes());
            dos.finish();

            byte[] compressedData = baos.toByteArray();
            System.out.println("Compressed data: " + new String(compressedData));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
