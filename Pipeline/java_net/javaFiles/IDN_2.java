import java.net.IDN;

public class IDN_2 {
    public static void main(String[] args) {
        String input = "example.com";
        String output = IDN.toUnicode(input);
        System.out.println(output);
    }
}
