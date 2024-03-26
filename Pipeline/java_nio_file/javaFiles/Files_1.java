import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Files_1 {
    public static void main(String[] args) {
        try {
            // Define the directory path
            Path dir = Paths.get("/path/to/directory");

            // Define the permissions for the directory
            Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-xr-x");
            FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);

            // Create the directory
            Files.createDirectory(dir, attr);

            System.out.println("Directory created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
