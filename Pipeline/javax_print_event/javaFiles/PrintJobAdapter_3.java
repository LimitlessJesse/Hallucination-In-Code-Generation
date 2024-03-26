import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_3 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobCanceled(PrintJobEvent pje) {
                System.out.println("Print job canceled: " + pje.getPrintJob());
            }
        };

        // You can use the adapter here, but it's not necessary for this example.
    }
}
