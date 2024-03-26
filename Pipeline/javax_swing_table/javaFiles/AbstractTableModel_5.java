import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Column1", "Column2"};
    private Object[][] data = {{"Data1", "Data2"}, {"Data3", "Data4"}};

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        // Here you can set which cells are editable
        // For example, only the first column is editable
        if (col == 0) {
            return true;
        } else {
            return false;
        }
    }
}
