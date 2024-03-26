import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;

public class ZipEntry_4 {
    public static void main(String[] args) {
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"));
            ZipEntry ze = new ZipEntry("test.txt");
            ze.setMethod(ZipEntry.STORED);
            int method = ze.getMethod();
            System.out.println("Method of compression: " + method);
            zos.putNextEntry(ze);
            zos.closeEntry();
            zos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
