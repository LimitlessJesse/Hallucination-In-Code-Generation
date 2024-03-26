import javax.security.auth.kerberos.KerberosTicket;
import javax.security.auth.kerberos.KerberosPrincipal;

public class KerberosPrincipal_3 {
    public static void main(String[] args) {
        KerberosTicket ticket = new KerberosTicket();
        KerberosPrincipal principal = new KerberosPrincipal("test", "realm");
        ticket.setPrincipal(principal);
        System.out.println(ticket.getRealm());
    }
}
