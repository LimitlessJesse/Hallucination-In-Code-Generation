import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_9 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("PT10S");
            System.out.println(duration.getSeconds());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
