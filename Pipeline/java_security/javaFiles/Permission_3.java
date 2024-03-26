import java.security.Permission;

public class Permission_3 {
    public static void main(String[] args) {
        Permission permission = new Permission("permissionName") {
            @Override
            public boolean implies(Permission p) {
                return false;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
