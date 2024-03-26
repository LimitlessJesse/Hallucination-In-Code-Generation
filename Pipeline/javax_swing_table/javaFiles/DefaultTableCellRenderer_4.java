import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class DefaultTableCellRenderer_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Name", "Surname", "Age"};
        Object[][] data = {
            {"John", "Doe", 25},
            {"Jane", "Doe", 30},
            {"Jim", "Smith", 35}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Set the foreground color of the text in the cell
        table.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setForeground(Color.RED);
                return c;
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
