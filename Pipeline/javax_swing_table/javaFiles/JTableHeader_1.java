import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class JTableHeader_1 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
    }
}
