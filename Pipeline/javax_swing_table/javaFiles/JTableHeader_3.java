import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class JTableHeader_3 {
    public static void main(String[] args) {
        // Create a JTable
        String[] columnNames = {"Name", "Surname", "Age"};
        Object[][] data = {
            {"John", "Doe", 25},
            {"Jane", "Doe", 22},
            {"Bob", "Smith", 30}
        };
        JTable table = new JTable(data, columnNames);

        // Get the JTableHeader
        JTableHeader header = table.getTableHeader();

        // Set whether the header can be resized by the user
        header.setResizingAllowed(false);

        // Create a JFrame to display the table
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
