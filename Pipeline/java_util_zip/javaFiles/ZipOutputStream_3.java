import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStream_3 {
    public static void main(String[] args) {
        String fileName = "example.zip";
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileName))) {
            ZipEntry ze = new ZipEntry("test.txt");
            zos.putNextEntry(ze);
            // Write something to the file
            zos.write("Hello, World!".getBytes());
            // Close the current entry
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
