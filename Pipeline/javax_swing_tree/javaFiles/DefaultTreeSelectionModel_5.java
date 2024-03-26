import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_5 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();

        // Add a child node
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");
        model.insertNodeInto(child, root, 0);

        // Select the child node
        selectionModel.addSelectionPath(new TreePath(child.getPath()));

        // Remove the selection
        selectionModel.removeSelectionPath(new TreePath(child.getPath()));
    }
}
