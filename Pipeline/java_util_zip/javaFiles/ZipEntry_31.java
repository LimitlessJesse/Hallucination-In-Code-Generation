import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_31 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_file_in_zip");
            long size = zipEntry.getSize();
            System.out.println("Uncompressed size of the file: " + size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
