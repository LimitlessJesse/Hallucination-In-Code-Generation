import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;

public class DefaultListSelectionModel_4 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        listModel.addElement("Item 4");
        listModel.addElement("Item 5");

        JList<String> list = new JList<>(listModel);

        DefaultListSelectionModel selectionModel = new DefaultListSelectionModel();
        list.setSelectionModel(selectionModel);

        // Set selection interval
        selectionModel.setSelectionInterval(1, 3);
    }
}
