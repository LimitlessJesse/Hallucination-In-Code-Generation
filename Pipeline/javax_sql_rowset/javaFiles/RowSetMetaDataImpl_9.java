import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_9 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        metaData.setColumnLabel(0, "Column1");
        metaData.setColumnLabel(1, "Column2");
        System.out.println(metaData.getColumnLabel(0)); // Output: Column1
        System.out.println(metaData.getColumnLabel(1)); // Output: Column2
    }
}
