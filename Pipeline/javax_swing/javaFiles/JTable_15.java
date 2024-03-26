import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class JTable_15 {
    public static void main(String[] args) {
        JTable table = new JTable(10, 5);
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column = columnModel.getColumn(0);
        column.setHeaderValue("Column Header");
    }
}
