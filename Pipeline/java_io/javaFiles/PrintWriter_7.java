import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintWriter_7 {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.print("Hello, World!");
        pw.close();
        System.out.println(sw.toString());
    }
}
