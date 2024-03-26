import java.lang.SecurityManager;

public class SecurityManager_4 {
    public static void main(String[] args) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!= null) {
            securityManager.checkRead("file.txt");
        }
    }
}
