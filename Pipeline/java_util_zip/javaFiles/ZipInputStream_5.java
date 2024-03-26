import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_5 {
    public static void main(String[] args) {
        String filePath = "path_to_your_zip_file";

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(filePath))) {
            ZipEntry zipEntry = zipInputStream.getNextEntry();

            while (zipEntry!= null) {
                // Process the current entry
                //...

                // Close the current entry
                zipInputStream.closeEntry();

                // Get the next entry
                zipEntry = zipInputStream.getNextEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
