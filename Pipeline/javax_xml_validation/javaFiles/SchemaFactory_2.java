import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class SchemaFactory_2 {
    public static void main(String[] args) {
        try {
            // Create a SchemaFactory capable of understanding WXS schemas
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

            // Create a Source from a file
            File schemaFile = new File("path_to_your_schema_file");
            Source schemaSource = new StreamSource(schemaFile);

            // Create a Schema from the Source
            Schema schema = factory.newSchema(schemaSource);

            // Now you can use the schema to validate XML documents
            //...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
