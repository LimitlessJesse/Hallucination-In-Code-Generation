import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NamingException;

public class CompositeName_5 {
    public static void main(String[] args) throws NamingException {
        Name name = new CompositeName("cn=John Doe,ou=People,dc=example,dc=com");
        CompositeName compositeName = (CompositeName) name;
        int size = compositeName.size();
        System.out.println("Number of components in the composite name: " + size);
    }
}
