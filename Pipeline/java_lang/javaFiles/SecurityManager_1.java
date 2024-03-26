import java.lang.reflect.Method;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class SecurityManager_1 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                if (perm.getName().equals("exitVM")) {
                    throw new SecurityException("Not allowed to exitVM");
                }
            }
        };

        System.setSecurityManager(securityManager);

        try {
            Method method = SecurityManager.class.getDeclaredMethod("checkPermission", Permission.class);
            method.setAccessible(true);
            method.invoke(securityManager, new RuntimePermission("exitVM"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
