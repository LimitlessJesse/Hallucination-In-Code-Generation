import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class TreePath_2 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");
        root.add(child1);
        root.add(child2);

        TreePath treePath = new TreePath(root.getPath());
        int pathCount = treePath.getPathCount();

        System.out.println("Number of paths in the tree: " + pathCount);
    }
}
