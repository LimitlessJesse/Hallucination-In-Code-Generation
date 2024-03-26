import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class DefaultTreeCellEditor_1 {
    public static void main(String[] args) {
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));
        DefaultTreeCellEditor editor = new DefaultTreeCellEditor(model);

        TreeNode root = model.getRoot();
        TreeNode node1 = new DefaultMutableTreeNode("Node 1");
        TreeNode node2 = new DefaultMutableTreeNode("Node 2");
        root.add(node1);
        root.add(node2);

        TreeModelEvent event = new TreeModelEvent(model, new Object[] { node1 });
        boolean isEditable = editor.isCellEditable(event);

        System.out.println("Is node1 editable? " + isEditable);
    }
}
