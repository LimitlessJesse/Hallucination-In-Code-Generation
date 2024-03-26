import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CORBA.ORBPackage.NameValuePair;
import org.omg.CORBA.NamingContextExt;

public class ORB_3 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        NamingContextExt namingContext = (NamingContextExt) orb.resolve_initial_references("NameService");
        try {
            Object obj = namingContext.resolve_str("Hello");
            System.out.println(obj);
        } catch (InvalidName e) {
            e.printStackTrace();
        }
    }
}
