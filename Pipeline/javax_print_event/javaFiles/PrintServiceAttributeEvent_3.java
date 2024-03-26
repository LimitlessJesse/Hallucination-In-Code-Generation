import javax.print.PrintService;
import javax.print.event.PrintServiceAttributeEvent;

public class PrintServiceAttributeEvent_3 {
    public static void main(String[] args) {
        // Assume we have a PrintServiceAttributeEvent object named event
        PrintServiceAttributeEvent event = new PrintServiceAttributeEvent(new PrintService());
        PrintService printService = event.getPrintService();
        System.out.println(printService);
    }
}
