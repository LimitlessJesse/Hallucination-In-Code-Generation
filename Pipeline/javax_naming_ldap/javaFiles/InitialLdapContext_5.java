import javax.naming.ldap.Control;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.NamingException;
import javax.naming.directory.BasicControl;

public class InitialLdapContext_5 {
    public static void main(String[] args) {
        try {
            // Create a new LDAP context
            LdapContext ctx = new InitialLdapContext();

            // Create a new control
            Control control = new BasicControl("1.2.3.4", true, "control value".getBytes());

            // Set the request controls
            ctx.setRequestControls(new Control[] { control });

            // Do something with the context...

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
