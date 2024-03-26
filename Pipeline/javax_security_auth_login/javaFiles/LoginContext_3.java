import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_3 {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("MyLoginContext");
            loginContext.login();
            Subject subject = loginContext.getSubject();
            System.out.println(subject);
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
