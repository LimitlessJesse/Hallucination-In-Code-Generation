import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class JTable_8 {
    public static void main(String[] args) {
        JTable table = new JTable(10, 10);
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer());
    }
}
