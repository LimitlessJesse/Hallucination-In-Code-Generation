import java.nio.file.*;

public class Files_41 {
    public static void main(String[] args) {
        Path source = Paths.get("sourceFile.txt");
        Path target = Paths.get("targetFile.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error occurred while copying file");
            e.printStackTrace();
        }
    }
}
