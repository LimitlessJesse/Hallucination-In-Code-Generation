import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_7 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a child node
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");

        // Add the child node to the root node
        root.add(child);

        // Create a tree model and set the root node
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();

        // Set the tree model
        selectionModel.setModel(treeModel);

        // Create a tree path for the child node
        TreePath childPath = new TreePath(child.getPath());

        // Set the selection paths
        selectionModel.setSelectionPaths(new TreePath[] { childPath });
    }
}
