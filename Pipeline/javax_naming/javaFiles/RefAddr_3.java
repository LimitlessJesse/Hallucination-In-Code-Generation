import javax.naming.RefAddr;
import javax.naming.NamingException;

public class RefAddr_3 {
    public static void main(String[] args) {
        try {
            RefAddr refAddr = new RefAddr("type", "value");
            String type = refAddr.getType();
            System.out.println("Type: " + type);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
