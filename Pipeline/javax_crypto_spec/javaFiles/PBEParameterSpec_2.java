import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_2 {
    public static void main(String[] args) {
        PBEParameterSpec spec = new PBEParameterSpec(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 10);
        byte[] salt = spec.getSalt();
        for (byte b : salt) {
            System.out.print(b + " ");
        }
    }
}
