import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileStore_5 {
    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath(".");
        FileStore store = Files.getFileStore(path);
        System.out.println("Name of the file store: " + store.name());
    }
}
