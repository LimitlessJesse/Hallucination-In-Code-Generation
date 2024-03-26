import java.nio.file.*;
import java.util.Set;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;

public class Files_21 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/path/to/file");
        Set<PosixFilePermission> perms = new HashSet<>();
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_WRITE);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_WRITE);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);
        Files.setPosixFilePermissions(path, perms);
    }
}
