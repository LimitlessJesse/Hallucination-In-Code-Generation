import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_2 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file.zip");
            ZipEntry zipEntry = zipFile.getEntry("name_of_the_file_in_zip");
            System.out.println(zipEntry.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
