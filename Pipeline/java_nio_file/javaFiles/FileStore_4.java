import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class FileStore_4 {
    public static void main(String[] args) {
        try {
            FileStore store = Files.getFileStore(FileSystems.getDefault().getPath("/"));
            boolean isReadOnly = store.isReadOnly();
            System.out.println("Is the file store read-only? " + isReadOnly);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
