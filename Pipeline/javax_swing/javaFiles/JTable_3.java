import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_3 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JTable
        Object[][] data = {
            {"1", "John", "Doe"},
            {"2", "Jane", "Doe"},
            {"3", "Jim", "Taylor"}
        };
        String[] columnNames = {"ID", "First Name", "Last Name"};
        JTable table = new JTable(data, columnNames);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        frame.getContentPane().add(scrollPane);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Make the JFrame visible
        frame.setVisible(true);

        // Get the value at a specific row and column
        String value = (String) table.getValueAt(0, 1);
        System.out.println("Value at row 0, column 1: " + value);
    }
}
