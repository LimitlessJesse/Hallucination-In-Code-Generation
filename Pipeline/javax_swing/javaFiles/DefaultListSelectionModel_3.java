import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import java.util.Arrays;

public class DefaultListSelectionModel_3 {
    public static void main(String[] args) {
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Select the first item
        selectionModel.setSelectionInterval(0, 0);

        // Check if the first item is selected
        boolean isSelected = selectionModel.isSelectedIndex(0);
        System.out.println("Is the first item selected? " + isSelected);
    }
}
