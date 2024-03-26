import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFile_2 {
    public static void main(String[] args) {
        try {
            ZipFile zipFile = new ZipFile("path_to_your_zip_file");
            ZipEntry zipEntry = zipFile.getEntry("name_of_the_entry_in_zip_file");
            if (zipEntry!= null) {
                System.out.println("ZipEntry found: " + zipEntry.getName());
            } else {
                System.out.println("ZipEntry not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
