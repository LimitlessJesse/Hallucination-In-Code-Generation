import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_11 {
    public static void main(String[] args) {
        String[] columnNames = {"Name", "Surname", "Age"};
        Object[][] data = {
            {"John", "Doe", 25},
            {"Jane", "Doe", 30},
            {"Jim", "Smith", 35}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Set auto resize mode
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
}
