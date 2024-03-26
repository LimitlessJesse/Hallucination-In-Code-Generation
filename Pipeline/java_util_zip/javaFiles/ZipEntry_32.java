import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipEntry_32 {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"))) {
            ZipEntry entry = new ZipEntry("test.txt");
            entry.setCrc(0x12345678);
            zos.putNextEntry(entry);
            zos.write("Hello, World!".getBytes());
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
