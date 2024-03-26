import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DefaultTableCellRenderer_5 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column1");
        model.addColumn("Column2");
        model.addRow(new Object[] {"Value1", "Value2"});

        JTable table = new JTable(model);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setValue("New Value");

        table.getColumnModel().getColumn(0).setCellRenderer(renderer);

        JFrame frame = new JFrame();
        frame.add(table);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
