import javax.management.remote.JMXPrincipal;

public class JMXPrincipal_6 {
    public static void main(String[] args) {
        JMXPrincipal principal1 = new JMXPrincipal("user1", "password1".toCharArray());
        JMXPrincipal principal2 = new JMXPrincipal("user1", "password1".toCharArray());
        JMXPrincipal principal3 = new JMXPrincipal("user2", "password2".toCharArray());

        System.out.println(principal1.equals(principal2)); // true
        System.out.println(principal1.equals(principal3)); // false
    }
}
