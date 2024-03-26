import java.net.IDN;

public class IDN_3 {
    public static void main(String[] args) {
        String input = "example.com";
        int flags = IDN.ALLOW_UNASSIGNED;
        String output = IDN.toUnicode(input, flags);
        System.out.println(output);
    }
}
