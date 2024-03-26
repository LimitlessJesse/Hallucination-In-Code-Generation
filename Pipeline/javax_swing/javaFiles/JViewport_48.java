import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;

public class JViewport_48 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = scrollPane.getViewport();
        int scrollMode = viewport.getScrollMode();

        if (scrollMode == ScrollPaneConstants.SCROLLBARS_AS_NEEDED) {
            System.out.println("Scroll mode is SCROLLBARS_AS_NEEDED");
        } else if (scrollMode == ScrollPaneConstants.SCROLLBARS_ALWAYS) {
            System.out.println("Scroll mode is SCROLLBARS_ALWAYS");
        } else if (scrollMode == ScrollPaneConstants.SCROLLBARS_NEVER) {
            System.out.println("Scroll mode is SCROLLBARS_NEVER");
        }
    }
}
