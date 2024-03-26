import javax.swing.tree.TreePath;

public class TreePath_4 {
    public static void main(String[] args) {
        TreePath treePath = new TreePath(new Object[] { "Node1", "Node2", "Node3" });
        Object pathComponent = treePath.getPathComponent(1);
        System.out.println(pathComponent);
    }
}
