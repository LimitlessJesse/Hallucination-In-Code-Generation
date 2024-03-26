import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStore_1 {
    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath(".");
        FileStore store = Files.getFileStore(path);
        long totalSpace = store.getTotalSpace();
        System.out.println("Total space: " + totalSpace);
    }
}
