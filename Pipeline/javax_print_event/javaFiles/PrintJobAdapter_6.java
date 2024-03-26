import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_6 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobNoMoreEvents(PrintJobEvent pje) {
                // Your code here
            }
        };
    }
}
