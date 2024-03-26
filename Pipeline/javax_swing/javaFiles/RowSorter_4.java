import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.List;

public class RowSorter_4 {
    public static void main(String[] args) {
        TableModel model = new MyTableModel();
        RowSorter<TableModel> sorter = new TableRowSorter<>(model);
        sorter.toggleSortOrder(0);
    }
}

class MyTableModel implements TableModel {
    // Implement TableModel methods
}
