import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_13 {
    public static void main(String[] args) {
        DefaultTreeModel model = new DefaultTreeModel(null);
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel(model);

        // Add some nodes to the tree model
        model.insertNodeInto(new DefaultMutableTreeNode("Node 1"), null, 0);
        model.insertNodeInto(new DefaultMutableTreeNode("Node 2"), null, 1);

        // Select the first node
        selectionModel.setSelectionPath(new TreePath(model.getPathToRoot(model.getRoot())));

        // Get the lead selection row
        int leadSelectionRow = selectionModel.getLeadSelectionRow();

        System.out.println("Lead selection row: " + leadSelectionRow);
    }
}
