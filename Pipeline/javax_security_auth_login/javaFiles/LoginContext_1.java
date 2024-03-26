import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_1 {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("MyLoginContext");
            loginContext.login();
            System.out.println("Login successful");
        } catch (LoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
