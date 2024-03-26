import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private String[] columnNames = {"Column1", "Column2"};
    private Object[][] data = {{"Value1", "Value2"}, {"Value3", "Value4"}};

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }

    public void setValueAt(Object value, int row, int col) {
        if (value == null) {
            data[row][col] = null;
        } else {
            data[row][col] = value.toString();
        }
        fireTableCellUpdated(row, col);
    }
}
