import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_2 {
    public static void main(String[] args) {
        // Create a JTable
        JTable table = new JTable(5, 5);

        // Create a DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Set a value at a specific row and column
        model.setValueAt("Hello", 2, 2);

        // Print the table
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                System.out.print(table.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
