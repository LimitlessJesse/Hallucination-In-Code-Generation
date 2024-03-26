import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_3 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter password", false);
        passwordCallback.setPassword("myPassword".toCharArray());
        System.out.println("Password: " + new String(passwordCallback.getPassword()));
        passwordCallback.clearPassword();
        System.out.println("Cleared Password: " + new String(passwordCallback.getPassword()));
    }
}
