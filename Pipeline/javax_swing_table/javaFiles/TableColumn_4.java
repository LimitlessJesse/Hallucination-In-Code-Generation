import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class TableColumn_4 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
    }
}
