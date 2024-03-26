import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TableColumn_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);

        // Set the header value
        column.setHeaderValue("Column Header");

        // Get the header value
        Object headerValue = column.getHeaderValue();
        System.out.println("Header Value: " + headerValue);
    }
}
