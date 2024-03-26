import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Files_13 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("example.txt");
        Files.write(path, Arrays.asList("Hello", "World"), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
