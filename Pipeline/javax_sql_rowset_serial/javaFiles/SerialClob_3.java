import javax.sql.rowset.serial.SerialClob;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SerialClob_3 {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("org.h2.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:", "sa", "");

            // Create a CLOB
            Clob clob = conn.createClob();

            // Write to the CLOB
            clob.setString(1, "Hello, World!");

            // Create a SerialClob
            SerialClob serialClob = new SerialClob(clob);

            // Get a Reader for the CLOB
            Reader reader = serialClob.getCharacterStream();

            // Read the CLOB
            int ch;
            while ((ch = reader.read())!= -1) {
                System.out.print((char) ch);
            }

            // Close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
