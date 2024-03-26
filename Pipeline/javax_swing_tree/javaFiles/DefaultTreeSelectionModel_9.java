import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_9 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        selectionModel.setSelectionPath(new TreePath(root.getPath()));

        // Get the selection paths
        TreePath[] selectionPaths = selectionModel.getSelectionPaths();

        // Print the selection paths
        for (TreePath path : selectionPaths) {
            System.out.println(path);
        }
    }
}
