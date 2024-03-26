import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_5 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Add a child node
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("Child");
        model.insertNodeInto(child, root, 0);

        // Change the structure of the tree
        model.removeNodeFromParent(child);

        // Notify the model that the structure has changed
        model.nodeStructureChanged(root);
    }
}
