import javax.xml.validation.SchemaFactory;

public class SchemaFactory_1 {
    public static void main(String[] args) {
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        System.out.println(factory);
    }
}
