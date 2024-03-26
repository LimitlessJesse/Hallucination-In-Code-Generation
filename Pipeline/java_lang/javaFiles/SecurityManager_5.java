import java.lang.SecurityManager;

public class SecurityManager_5 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            try {
                securityManager.checkWrite("file.txt");
                System.out.println("Write operation permitted.");
            } catch (SecurityException e) {
                System.out.println("Write operation not permitted.");
            }
        } else {
            System.out.println("No security manager is present.");
        }
    }
}
