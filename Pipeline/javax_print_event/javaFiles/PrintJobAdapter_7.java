import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_7 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobRequiresAttention(PrintJobEvent pje) {
                System.out.println("Print job requires attention! " + pje.toString());
            }
        };
    }
}
