import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_3 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile(new File("path_to_your_zip_file.zip"));
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println(entry.getName());
            }

            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
