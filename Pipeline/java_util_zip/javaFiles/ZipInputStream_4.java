import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_4 {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("path_to_your_zip_file"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry())!= null) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    // process the buffer
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
