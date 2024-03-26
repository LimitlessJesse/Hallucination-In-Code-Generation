import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.Types;

public class RowSetMetaDataImpl_8 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metaData = new RowSetMetaDataImpl();
        metaData.addColumn("columnName", Types.VARCHAR, 10, 0, 0, 0, false);
        int columnType = metaData.getColumnType(1);
        System.out.println("Type of the column: " + columnType);
    }
}
