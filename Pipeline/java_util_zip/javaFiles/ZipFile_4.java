import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_4 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file.zip");
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                InputStream inputStream = zipFile.getInputStream(entry);

                // Read from inputStream here

                inputStream.close();
            }

            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
