import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_DropLocation_1 {
    public static void main(String[] args) {
        JTable table = new JTable(new String[][] { { "1", "2" }, { "3", "4" } }, new String[] { "Column 1", "Column 2" });
        JTable.DropLocation dropLocation = new JTable.DropLocation(table, 1, 1);
        int column = dropLocation.getColumn();
        System.out.println("Column index: " + column);
    }
}
