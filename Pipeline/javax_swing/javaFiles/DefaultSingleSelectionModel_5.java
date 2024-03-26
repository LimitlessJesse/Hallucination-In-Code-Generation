import javax.swing.DefaultListModel;
import javax.swing.DefaultSingleSelectionModel;

public class DefaultSingleSelectionModel_5 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        DefaultSingleSelectionModel<String> selectionModel = new DefaultSingleSelectionModel<>(listModel);

        // Select the second item
        selectionModel.setSelectedIndex(1);

        // Get the index of the selected item
        int selectedIndex = selectionModel.getSelectedIndex();

        System.out.println("Selected index: " + selectedIndex);
    }
}
