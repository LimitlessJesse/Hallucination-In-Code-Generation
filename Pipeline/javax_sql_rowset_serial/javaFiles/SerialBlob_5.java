import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;
import java.io.InputStream;

public class SerialBlob_5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM blob_table")) {

            while (resultSet.next()) {
                Blob blob = resultSet.getBlob("blob_column");
                if (blob!= null) {
                    SerialBlob serialBlob = (SerialBlob) blob;
                    InputStream inputStream = serialBlob.getBinaryStream();
                    // Use the inputStream as needed...
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
