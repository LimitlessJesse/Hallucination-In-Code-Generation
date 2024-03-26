import javax.swing.event.TreeModelEvent;
import javax.swing.tree.TreeModel;

public class TreeModelEvent_2 {
    public static void main(String[] args) {
        TreeModel treeModel = new TreeModel() {
            // Implement the methods of TreeModel interface
            //...
        };

        TreeModelEvent event = new TreeModelEvent(treeModel, new int[]{0, 1, 2});
        int[] childIndices = event.getChildIndices();

        for (int index : childIndices) {
            System.out.println(index);
        }
    }
}
