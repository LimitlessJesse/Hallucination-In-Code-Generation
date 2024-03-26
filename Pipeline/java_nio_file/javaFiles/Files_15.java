import java.nio.file.*;
import java.io.IOException;

public class Files_15 {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_file");
        try {
            Files.setAttribute(path, "key", "value", LinkOption... options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
