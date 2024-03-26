import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_4 {
    public static void main(String[] args) {
        try {
            // Create a byte array output stream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // Create a GZIP output stream
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);

            // Create a byte array
            byte[] byteArray = {1, 2, 3, 4, 5};

            // Write bytes to the compressed output stream
            gzipOutputStream.write(byteArray, 0, byteArray.length);

            // Close the GZIP output stream
            gzipOutputStream.close();

            // Get the compressed data
            byte[] compressedData = byteArrayOutputStream.toByteArray();

            // Print the compressed data
            for (byte b : compressedData) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
