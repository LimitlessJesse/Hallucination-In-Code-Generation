import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissions_10 {
    public static void main(String[] args) {
        String permString = "rwxr-xr-x";
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString(permString);
        System.out.println(perms);
    }
}
