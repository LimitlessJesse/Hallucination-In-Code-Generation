import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_5 {
    public static void main(String[] args) {
        KerberosPrincipal principal = new KerberosPrincipal("test/test@EXAMPLE.COM");
        int hashCode = principal.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
