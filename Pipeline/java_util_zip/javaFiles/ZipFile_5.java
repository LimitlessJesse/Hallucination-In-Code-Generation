import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class ZipFile_5 {
    public static void main(String[] args) {
        try {
            // Create a ZipFile object
            File file = new File("path_to_your_zip_file");
            ZipFile zipFile = new ZipFile(file);

            // Close the ZipFile
            zipFile.close();

            System.out.println("ZipFile closed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
