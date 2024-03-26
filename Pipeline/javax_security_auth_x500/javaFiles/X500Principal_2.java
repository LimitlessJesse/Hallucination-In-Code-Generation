import javax.security.auth.x500.X500Principal;

public class X500Principal_2 {
    public static void main(String[] args) {
        X500Principal principal = new X500Principal("CN=John Doe, OU=IT, O=Example Inc., L=New York, ST=New York, C=US");
        String name = principal.getName();
        System.out.println(name);
    }
}
