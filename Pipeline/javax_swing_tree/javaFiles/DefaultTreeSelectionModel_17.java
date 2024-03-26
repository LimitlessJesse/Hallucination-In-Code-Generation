import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Selection Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        JTree tree = new JTree(root);
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultTreeSelectionModel selectionModel = (DefaultTreeSelectionModel) model.getSelectionPaths();

        selectionModel.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                System.out.println("Tree selection changed: " + e.getPath());
            }
        });

        frame.getContentPane().add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}
