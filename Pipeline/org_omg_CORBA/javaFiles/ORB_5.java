import org.omg.CORBA.ORB;

public class ORB_5 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        orb.shutdown(true);
    }
}
