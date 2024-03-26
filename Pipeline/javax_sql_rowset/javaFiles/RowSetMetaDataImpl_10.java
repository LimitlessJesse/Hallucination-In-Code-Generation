import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_10 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        metaData.addColumn("columnName", "className", 10, 0, false);
        System.out.println(metaData.getColumnClassName(1));
    }
}
