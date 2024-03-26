import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_6 {
    public static void main(String[] args) {
        // Create a JTable
        JTable table = new JTable();

        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Add columns
        model.addColumn("Column1");
        model.addColumn("Column2");

        // Add rows
        model.addRow(new Object[] {"Row1-Column1", "Row1-Column2"});
        model.addRow(new Object[] {"Row2-Column1", "Row2-Column2"});

        // Set the model
        table.setModel(model);
    }
}
