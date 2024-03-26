import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;

public class TableColumn_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn(0);
        column.setMaxWidth(100);
        model.addColumn(column);
    }
}
