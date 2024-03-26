import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_5 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            ctx.bind("myObject", "Hello, World!");
            System.out.println(ctx.lookup("myObject")); // Outputs: Hello, World!
            ctx.unbind("myObject");
            System.out.println(ctx.lookup("myObject")); // Throws javax.naming.NameNotFoundException
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
