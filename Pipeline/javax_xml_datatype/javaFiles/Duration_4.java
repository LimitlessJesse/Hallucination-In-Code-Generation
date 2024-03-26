import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            Duration duration = df.newDuration("P1Y2M3DT4H5M6S");
            System.out.println("Years: " + duration.getYears());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
