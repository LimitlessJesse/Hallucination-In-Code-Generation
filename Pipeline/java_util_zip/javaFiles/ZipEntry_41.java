import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ZipEntry_41 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("name_of_your_zip_entry");
            String comment = zipEntry.getComment();
            System.out.println("Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
