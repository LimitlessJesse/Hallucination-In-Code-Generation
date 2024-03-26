import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.net.URL;

public class SchemaFactory_3 {
    public static void main(String[] args) {
        try {
            URL schemaURL = new URL("http://www.example.com/schema.xsd");
            SchemaFactory factory = SchemaFactory.newInstance();
            Schema schema = factory.newSchema(schemaURL);
            System.out.println("Schema created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
