import java.lang.SecurityManager;

public class SecurityManager_3 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if (status!= 0) {
                    throw new SecurityException("Application is about to exit with non-zero status");
                }
            }
        };

        System.setSecurityManager(securityManager);

        try {
            System.exit(0); // This will not throw any exception
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        try {
            System.exit(1); // This will throw a SecurityException
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
