import java.security.BasicPermission;

public class BasicPermission_4 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("permissionName");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
