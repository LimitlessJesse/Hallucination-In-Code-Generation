import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPOutputStream_5 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file.gz");
             GZIPOutputStream gzipOS = new GZIPOutputStream(fos)) {
            // Write data to the GZIP output stream
            gzipOS.write("Hello, World!".getBytes());
            // Finish writing to the GZIP output stream
            gzipOS.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
