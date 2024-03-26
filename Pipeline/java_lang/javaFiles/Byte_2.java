import java.lang.Byte;

public class Byte_2 {
    public static void main(String[] args) {
        String s = "101";
        int radix = 2;
        byte b = Byte.parseByte(s, radix);
        System.out.println(b);
    }
}
