import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class FileStore_2 {
    public static void main(String[] args) throws Exception {
        FileStore store = Files.getFileStore(FileSystems.getDefault().getPath("/"));
        long usableSpace = store.getUsableSpace();
        System.out.println("Usable space: " + usableSpace);
    }
}
