import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

public class DefaultListSelectionModel_2 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        JList<String> list = new JList<>(listModel);
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Select the first item
        selectionModel.setSelectionInterval(0, 0);

        // Print the current selection
        System.out.println("Current Selection: " + selectionModel.getSelectedIndices());

        // Clear the selection
        selectionModel.clearSelection();

        // Print the current selection after clearing
        System.out.println("Current Selection after clearing: " + selectionModel.getSelectedIndices());
    }
}
