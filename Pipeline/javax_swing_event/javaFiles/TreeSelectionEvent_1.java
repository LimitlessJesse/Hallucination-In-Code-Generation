import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;

public class TreeSelectionEvent_1 {
    public static void main(String[] args) {
        TreeSelectionEvent event = new TreeSelectionEvent(null, null, null);
        TreePath path = event.getPath();
        System.out.println(path);
    }
}
