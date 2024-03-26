import javax.print.PrintService;
import javax.print.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeEvent;

public class PrintServiceAttributeEvent_2 {
    public static void main(String[] args) {
        PrintServiceAttributeSet attributeSet = getAttributeSet();
        System.out.println(attributeSet);
    }

    public static PrintServiceAttributeSet getAttributeSet() {
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        PrintServiceAttributeSet attributeSet = null;
        for (PrintService service : services) {
            PrintServiceAttributeSet serviceAttributes = service.getAttributes();
            if (serviceAttributes!= null) {
                attributeSet = serviceAttributes;
                break;
            }
        }
        return attributeSet;
    }
}
