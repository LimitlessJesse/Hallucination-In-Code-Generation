import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_4 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            String name = "myObject";
            Object obj = new Object();
            ctx.bind(name, obj);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
