import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermission_5 {
    public static void main(String[] args) {
        try {
            FilePermission filePermission = new FilePermission("<<ALL FILES>>", "read,write");
            PermissionCollection permissionCollection = filePermission.newPermissionCollection();
            permissionCollection.add(filePermission);
            System.out.println(permissionCollection.getActions());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
