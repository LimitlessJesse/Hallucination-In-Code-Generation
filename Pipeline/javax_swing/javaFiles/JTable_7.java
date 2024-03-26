import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class JTable_7 {
    public static void main(String[] args) {
        JTable table = new JTable();
        TableCellEditor editor = new MyTableCellEditor();
        table.setDefaultEditor(String.class, editor);
    }
}

class MyTableCellEditor extends AbstractCellEditor implements TableCellEditor {
    // Implement the methods of TableCellEditor interface
    //...
}
