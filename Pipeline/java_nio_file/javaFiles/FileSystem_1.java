import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystem_1 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:", "Users", "user", "Desktop", "file.txt");
        System.out.println(path);
    }
}
