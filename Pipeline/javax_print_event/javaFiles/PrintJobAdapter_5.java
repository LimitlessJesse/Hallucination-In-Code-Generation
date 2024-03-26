import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_5 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobFailed(PrintJobEvent pje) {
                System.out.println("Print job failed: " + pje.toString());
            }
        };

        // You can use the adapter here, but it's not necessary for this example.
    }
}
