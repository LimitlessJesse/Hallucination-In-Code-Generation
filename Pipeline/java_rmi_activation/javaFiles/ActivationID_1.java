import java.rmi.activation.ActivationID;

public class ActivationID_1 {
    public static void main(String[] args) {
        ActivationID id1 = new ActivationID(1L);
        ActivationID id2 = new ActivationID(1L);
        ActivationID id3 = new ActivationID(2L);

        System.out.println(id1.equals(id2));  // true
        System.out.println(id1.equals(id3));  // false
    }
}
