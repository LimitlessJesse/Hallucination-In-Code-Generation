import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_1 {
    public static void main(String[] args) {
        // Create a JTable
        JTable table = new JTable(new DefaultTableModel(new Object[][] {
            {"Row1", "Column1"},
            {"Row2", "Column2"}
        }, new String[] {
            "Column1", "Column2"
        }));

        // Get the number of rows in the table
        int rowCount = table.getRowCount();

        // Get the number of columns in the table
        int columnCount = table.getColumnCount();

        // Loop through each row and column
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                // Check if the cell is editable
                if (table.isCellEditable(row, column)) {
                    System.out.println("Cell at row " + row + ", column " + column + " is editable.");
                } else {
                    System.out.println("Cell at row " + row + ", column " + column + " is not editable.");
                }
            }
        }
    }
}
