import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a byte array to hold the original data
            byte[] originalData = "Hello, World!".getBytes();

            // Create a byte array output stream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // Create a deflater
            Deflater deflater = new Deflater();

            // Create a deflater output stream
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);

            // Write the original data to the deflater output stream
            deflaterOutputStream.write(originalData);

            // Close the deflater output stream
            deflaterOutputStream.close();

            // Get the compressed data
            byte[] compressedData = byteArrayOutputStream.toByteArray();

            // Create a byte array input stream
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);

            // Create an inflater input stream
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

            // Read the decompressed data
            byte[] decompressedData = new byte[originalData.length];
            inflaterInputStream.read(decompressedData);

            // Print the decompressed data
            System.out.println(new String(decompressedData));

            // Reset the inflater input stream
            inflaterInputStream.reset();

            // Read the decompressed data again
            byte[] decompressedDataAgain = new byte[originalData.length];
            inflaterInputStream.read(decompressedDataAgain);

            // Print the decompressed data again
            System.out.println(new String(decompressedDataAgain));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
