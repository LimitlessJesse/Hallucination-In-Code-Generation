import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_16 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreeSelectionListener listener = null; // replace with your listener
        model.removeTreeSelectionListener(listener);
    }
}
