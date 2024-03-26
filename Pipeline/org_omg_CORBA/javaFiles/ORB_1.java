import org.omg.CORBA.ORB;

public class ORB_1 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        orb.destroy();
    }
}
