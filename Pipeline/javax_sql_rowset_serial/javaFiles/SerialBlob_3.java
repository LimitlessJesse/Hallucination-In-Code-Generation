import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

public class SerialBlob_3 {
    public static void main(String[] args) {
        try {
            Blob blob = new SerialBlob("Hello, World!".getBytes());
            blob.truncate(5);
            System.out.println(new String(((SerialBlob) blob).getBytes(1, (int) blob.length())));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
