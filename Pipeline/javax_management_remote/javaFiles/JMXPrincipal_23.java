import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_23 {
    public static void main(String[] args) {
        JMXPrincipal principal = new JMXPrincipal("username");
        System.out.println(principal.toString());
    }
}
