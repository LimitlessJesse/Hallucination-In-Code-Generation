import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class FileStore_3 {
    public static void main(String[] args) {
        try {
            FileStore store = FileSystems.getDefault().getRootDirectories().iterator().next().getFileStore();
            long unallocatedSpace = store.getUnallocatedSpace();
            System.out.println("Unallocated space: " + unallocatedSpace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
