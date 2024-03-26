import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipEntry_38 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ZipOutputStream zos = new ZipOutputStream(baos)) {

            ZipEntry ze = new ZipEntry("test.txt");
            ze.setExtra(new byte[]{1, 2, 3, 4});
            zos.putNextEntry(ze);
            zos.write("Hello, World!".getBytes());
            zos.closeEntry();

            byte[] zipBytes = baos.toByteArray();
            System.out.println(new String(zipBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
