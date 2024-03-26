import javax.naming.InitialContext;
import javax.naming.NamingException;

public class InitialContext_2 {
    public static void main(String[] args) {
        InitialContext context = null;
        try {
            context = new InitialContext();
            // Use context
        } catch (NamingException e) {
            e.printStackTrace();
        } finally {
            if (context!= null) {
                try {
                    context.close();
                } catch (NamingException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
