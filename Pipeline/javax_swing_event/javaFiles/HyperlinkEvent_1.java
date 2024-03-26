import javax.swing.event.HyperlinkEvent;

public class HyperlinkEvent_1 {
    public static void main(String[] args) {
        HyperlinkEvent event = new HyperlinkEvent(null, null, null, null);
        System.out.println(event.getEventType());
    }
}
