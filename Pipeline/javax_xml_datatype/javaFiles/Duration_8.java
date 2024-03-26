import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_8 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            Duration duration = df.newDuration("PT1H20M");
            System.out.println(duration.getMinutes());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
