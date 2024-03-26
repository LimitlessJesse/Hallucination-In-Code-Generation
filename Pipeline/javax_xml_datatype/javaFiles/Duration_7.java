import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_7 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            Duration duration = df.newDuration("PT1H");
            System.out.println(duration.getHours());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
