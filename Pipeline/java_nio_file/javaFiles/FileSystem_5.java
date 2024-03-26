import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class FileSystem_5 {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        WatchService watchService = fileSystem.newWatchService();
    }
}
