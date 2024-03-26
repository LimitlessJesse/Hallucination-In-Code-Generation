import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_2 {
    public static void main(String[] args) {
        String fileName = "example.zip";
        byte[] buffer = "Hello, World!".getBytes();

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileName))) {
            ZipEntry ze = new ZipEntry("entry.txt");
            zos.putNextEntry(ze);
            zos.write(buffer, 0, buffer.length);
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
