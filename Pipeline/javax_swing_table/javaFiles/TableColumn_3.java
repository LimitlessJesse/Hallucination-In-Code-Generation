import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTextField;

public class TableColumn_3 {
    public static void main(String[] args) {
        TableColumn column = new TableColumn();
        JTextField textField = new JTextField();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JTextField.CENTER);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setBorder(null);
        column.setCellEditor(new DefaultCellEditor(textField));
        column.setCellRenderer(renderer);
    }
}
