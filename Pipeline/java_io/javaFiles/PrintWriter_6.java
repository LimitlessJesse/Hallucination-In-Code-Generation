import java.io.PrintWriter;

public class PrintWriter_6 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        pw.print(chars);
    }
}
