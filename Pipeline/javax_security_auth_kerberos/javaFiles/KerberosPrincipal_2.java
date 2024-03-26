import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_2 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("name@REALM");
        System.out.println(principal.getName());
    }
}
