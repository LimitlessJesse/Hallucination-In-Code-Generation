import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class TreePath_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");
        root.add(child1);
        root.add(child2);

        TreePath path = new TreePath(new Object[] {root, child1});
        Object lastComponent = path.getLastPathComponent();

        System.out.println("Last component of the path: " + lastComponent);
    }
}
