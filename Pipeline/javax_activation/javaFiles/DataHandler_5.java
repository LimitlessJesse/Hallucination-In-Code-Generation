import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;

public class DataHandler_5 {
    public static void main(String[] args) {
        try {
            DataSource source = new FileDataSource("path_to_your_file");
            DataHandler handler = new DataHandler(source);
            String name = handler.getName();
            System.out.println("Name of the data: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
