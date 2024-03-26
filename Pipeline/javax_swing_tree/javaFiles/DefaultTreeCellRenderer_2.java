import javax.swing.*;
import javax.swing.tree.*;

public class DefaultTreeCellRenderer_2 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(UIManager.getIcon("Tree.leafIcon"));
    }
}
