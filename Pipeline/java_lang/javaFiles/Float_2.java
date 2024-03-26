import java.lang.Float;

public class Float_2 {
    public static void main(String[] args) {
        int bits = 1077936128;
        float f = Float.intBitsToFloat(bits);
        System.out.println(f);
    }
}
