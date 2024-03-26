import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_2 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();

        // Add a selection path
        TreePath path = new TreePath(new Object[] {root, child1});
        selectionModel.addSelectionPath(path);

        // Print the selected paths
        for (TreePath selectedPath : selectionModel.getSelectionPaths()) {
            System.out.println(selectedPath);
        }
    }
}
