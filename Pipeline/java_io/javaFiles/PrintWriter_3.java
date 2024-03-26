import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintWriter_3 {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.print('H');
        pw.print('e');
        pw.print('l');
        pw.print('l');
        pw.print('o');
        pw.close();
        System.out.println(sw.toString());
    }
}
