import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.io.IOException;

public class Files_17 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file");
        FileTime time = FileTime.fromMillis(System.currentTimeMillis());

        try {
            Files.setLastModifiedTime(path, time);
            System.out.println("Last modified time set successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while setting the last modified time.");
            e.printStackTrace();
        }
    }
}
