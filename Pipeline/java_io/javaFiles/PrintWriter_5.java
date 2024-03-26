import java.io.PrintWriter;

public class PrintWriter_5 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.print(123.456);
    }
}
