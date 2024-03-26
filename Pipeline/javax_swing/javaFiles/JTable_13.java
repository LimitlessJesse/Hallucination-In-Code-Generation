import javax.swing.JTable;
import javax.swing.table.TableRowSorter;

public class JTable_13 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableRowSorter<?> sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        table.setAutoCreateRowSorter(true);
    }
}
