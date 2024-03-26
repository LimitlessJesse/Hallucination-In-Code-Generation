import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_4 {
    public static void main(String[] args) {
        KerberosPrincipal principal1 = new KerberosPrincipal("user1", "realm1");
        KerberosPrincipal principal2 = new KerberosPrincipal("user1", "realm1");
        KerberosPrincipal principal3 = new KerberosPrincipal("user2", "realm1");

        System.out.println(principal1.equals(principal2)); // true
        System.out.println(principal1.equals(principal3)); // false
    }
}
