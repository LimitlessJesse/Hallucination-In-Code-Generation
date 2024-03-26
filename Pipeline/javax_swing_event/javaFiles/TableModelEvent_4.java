import javax.swing.event.TableModelEvent;

public class TableModelEvent_4 {
    public static void main(String[] args) {
        TableModelEvent event = new TableModelEvent(null, 0, 0, TableModelEvent.ALL_COLUMNS_CHANGED);
        int column = event.getColumn();
        System.out.println("Column index: " + column);
    }
}
