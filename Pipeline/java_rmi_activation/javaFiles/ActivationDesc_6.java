import java.rmi.activation.ActivationDesc;

public class ActivationDesc_6 {
    public static void main(String[] args) {
        ActivationDesc desc1 = new ActivationDesc(null, null, null, null);
        ActivationDesc desc2 = new ActivationDesc(null, null, null, null);

        boolean isEqual = desc1.equals(desc2);

        System.out.println("Are desc1 and desc2 equal? " + isEqual);
    }
}
