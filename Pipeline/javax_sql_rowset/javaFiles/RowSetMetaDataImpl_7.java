import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_7 {
    public static void main(String[] args) {
        RowSetMetaDataImpl rsmd = new RowSetMetaDataImpl();
        rsmd.setColumnName(1, "Column1");
        rsmd.setColumnName(2, "Column2");
        rsmd.setColumnName(3, "Column3");

        System.out.println(rsmd.getColumnName(1)); // Output: Column1
        System.out.println(rsmd.getColumnName(2)); // Output: Column2
        System.out.println(rsmd.getColumnName(3)); // Output: Column3
    }
}
