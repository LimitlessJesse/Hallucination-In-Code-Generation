import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_DropLocation_2 {
    public static void main(String[] args) {
        JTable table = new JTable(new String[][] {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        }, new String[] {
            "Column 1", "Column 2", "Column 3"
        });

        JTable.DropLocation dropLocation = new JTable.DropLocation(table, 1, 1);
        int row = dropLocation.getRow();

        System.out.println("Row index: " + row);
    }
}
