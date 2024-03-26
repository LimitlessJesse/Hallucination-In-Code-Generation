import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelEvent_2 {
    public static void main(String[] args) {
        TableModel model = new TableModel() {
            // Implement the TableModel interface
        };

        TableModelListener listener = new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int firstRow = e.getFirstRow();
                int lastRow = e.getLastRow();
                System.out.println("First row: " + firstRow);
                System.out.println("Last row: " + lastRow);
            }
        };

        model.addTableModelListener(listener);

        // Trigger a change in the model
        model.fireTableDataChanged();
    }
}
