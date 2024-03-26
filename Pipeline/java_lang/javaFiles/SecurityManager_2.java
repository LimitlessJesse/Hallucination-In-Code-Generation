import java.lang.reflect.Method;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class SecurityManager_2 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                if (!"read".equals(perm.getName())) {
                    throw new SecurityException("Permission denied: " + perm.getName());
                }
            }
        };

        System.setSecurityManager(securityManager);

        try {
            Method method = Main.class.getMethod("someMethod");
            method.invoke(new Main());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void someMethod() {
        System.out.println("Method executed successfully");
    }
}
