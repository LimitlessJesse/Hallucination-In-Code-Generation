import java.nio.file.*;

public class Files_38 {
    public static void main(String[] args) throws IOException {
        Path existing = Paths.get("existing.txt");
        Path newLink = Paths.get("newLink.txt");

        Files.createFile(existing);
        Files.createSymbolicLink(newLink, existing);

        System.out.println("Symbolic link created successfully");
    }
}
