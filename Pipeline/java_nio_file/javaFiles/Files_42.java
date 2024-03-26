import java.nio.file.*;
import java.io.IOException;

public class Files_42 {
    public static void main(String[] args) {
        Path source = Paths.get("sourceFile.txt");
        Path target = Paths.get("targetDirectory/targetFile.txt");

        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
