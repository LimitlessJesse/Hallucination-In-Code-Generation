import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_3 {
    public static void main(String[] args) {
        GCMParameterSpec spec = new GCMParameterSpec(128, new byte[16]);
        int tagLength = spec.getTLen();
        System.out.println("Tag length: " + tagLength);
    }
}
