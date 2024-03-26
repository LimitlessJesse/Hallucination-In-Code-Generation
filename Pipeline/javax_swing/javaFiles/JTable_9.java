import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_9 {
    public static void main(String[] args) {
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        Object[][] data = {
            {"Row 1, Column 1", "Row 1, Column 2", "Row 1, Column 3"},
            {"Row 2, Column 1", "Row 2, Column 2", "Row 2, Column 3"},
            {"Row 3, Column 1", "Row 3, Column 2", "Row 3, Column 3"}
        };

        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(data, columnNames);
        table.setRowHeight(1, 50); // Set row 1 height to 50

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
