import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_39 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("entry_name");
            byte[] extra = zipEntry.getExtra();
            // Now you can use the extra field as you need
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
