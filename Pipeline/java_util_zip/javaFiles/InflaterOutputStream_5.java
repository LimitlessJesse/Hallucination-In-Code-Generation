import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_5 {
    public static void main(String[] args) throws IOException {
        // Compress data
        byte[] data = "Hello, World!".getBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(bos, new Deflater());
        dos.write(data);
        dos.finish();
        byte[] compressedData = bos.toByteArray();

        // Decompress data
        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        InflaterOutputStream ios = new InflaterOutputStream(bos2, new Inflater());
        ios.write(compressedData);
        ios.finish();
        byte[] decompressedData = bos2.toByteArray();

        System.out.println(new String(decompressedData));
    }
}
