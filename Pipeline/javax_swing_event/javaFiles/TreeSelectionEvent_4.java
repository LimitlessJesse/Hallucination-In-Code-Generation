import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;

public class TreeSelectionEvent_4 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(null, null, null);
        TreePath oldLeadSelectionPath = event.getOldLeadSelectionPath();
        System.out.println(oldLeadSelectionPath);
    }
}
