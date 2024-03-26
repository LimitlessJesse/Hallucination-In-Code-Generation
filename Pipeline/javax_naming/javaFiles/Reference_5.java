import javax.naming.Reference;
import javax.naming.NamingException;

public class Reference_5 {
    public static void main(String[] args) throws NamingException {
        Reference ref = new Reference("java.lang.String", "String", null);
        ref.add("Hello");
        ref.add("World");
        System.out.println(ref);
        ref.clear();
        System.out.println(ref);
    }
}
