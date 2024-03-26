import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Files_2 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("example.txt");
            Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
            FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
            Files.createFile(path, attr);
            System.out.println("File created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
