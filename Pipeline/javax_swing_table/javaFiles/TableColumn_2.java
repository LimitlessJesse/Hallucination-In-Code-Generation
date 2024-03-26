import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;

public class TableColumn_2 {
    public static void main(String[] args) {
        TableColumn column = new TableColumn();
        TableCellRenderer renderer = new DefaultTableCellRenderer();
        column.setCellRenderer(renderer);
    }
}
