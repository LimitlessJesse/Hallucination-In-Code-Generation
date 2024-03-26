import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTree_DropLocation_2 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        JTree tree = new JTree(root);

        // Add some nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        root.add(node1);
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        node1.add(node2);

        // Get the drop location
        JTree.DropLocation dropLocation = tree.getDropLocation();

        // Get the path
        TreePath path = dropLocation.getPath();

        // Print the path
        for (int i = 0; i < path.getPathCount(); i++) {
            System.out.println(path.getPathComponent(i));
        }
    }
}
