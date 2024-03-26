import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

public class SerialBlob_4 {
    public static void main(String[] args) {
        try {
            Blob blob = new SerialBlob("Hello, World!".getBytes());
            System.out.println("Blob created successfully");
            blob.free();
            System.out.println("Blob freed successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
