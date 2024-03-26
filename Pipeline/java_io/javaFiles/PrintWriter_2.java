import java.io.PrintWriter;

public class PrintWriter_2 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.print(true);
        pw.print(false);
    }
}
